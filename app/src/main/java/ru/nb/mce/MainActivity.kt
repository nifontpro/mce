package ru.nb.mce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.nb.mce.core_ui.Screen
import ru.nb.mce.ui.navigation.BottomBar
import ru.nb.mce.ui.theme.ContactsEventsTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

	private val viewModel: MainViewModel by viewModels()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		installSplashScreen().apply {
			setKeepOnScreenCondition {
				viewModel.isLoading.value
			}
		}

		setContent {
			ContactsEventsTheme {
				ConfigureExtNavigate()
			}
		}
	}
}

@Composable
private fun ConfigureExtNavigate() {
	val extNavController = rememberNavController()

	NavHost(
		navController = extNavController,
		startDestination = Screen.MainScreen.route
	) {
		composable(Screen.MainScreen.route) {
			ConfigureBottomNavigate(extNavController)
		}

		composable(
			Screen.ExtPersonInfoScreen.route,
//				arguments = listOf(navArgument(Argument.personId)),
		) {
			Text("Person info")
		}

		composable(
			Screen.ExtNewEventScreen.route,
//				arguments = listOf(navArgument(Argument.personId)),
		) {
			Text("New event")
		}

		composable(
			Screen.ExtEventUpdateScreen.route
//				arguments = listOf(
//					navArgument(Argument.personId), navArgument(Argument.eventId)
//				),
		) {
			Text("Update event...")
		}

		composable(
			Screen.ExtTemplatesScreen.route,
		) {
			Text("Template screen")
		}
	}
}

@Composable
private fun ConfigureBottomNavigate(extNavController: NavHostController) {
	val navController = rememberNavController()
	val backStackEntry = navController.currentBackStackEntryAsState()
	Scaffold(
		bottomBar = {
			BottomBar(
				onItemClick = { route ->
					navController.navigate(route) {
						navController.graph.startDestinationRoute?.let { route ->
							popUpTo(route) {
								saveState = true
							}
						}
						launchSingleTop = true
						restoreState = true
					}
				},
				isSelectItem = { route ->
					route == backStackEntry.value?.destination?.route
				}
			)
		}
	) { paddingValues ->
		val bottomPadding = paddingValues.calculateBottomPadding()
		NavHost(
			navController = navController,
			startDestination = Screen.NavEventScreen.route
		) {

			composable(Screen.NavEventScreen.route) {
				Text("Event screen")
			}
			composable(Screen.NavPersonScreen.route) {
				Text("Persons screen")
			}
			composable(Screen.NavGroupScreen.route) {
				Text("Group screen")
			}
			composable(Screen.NavSettingScreen.route) {
				Text("Settings screen")
			}
		}
	}
}


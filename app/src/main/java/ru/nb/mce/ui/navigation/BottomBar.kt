package ru.nb.mce.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun BottomBar(navController: NavHostController) {

	BottomNavigationBar(
		items = listOf(
			BottomNavItem.EventItem,
			BottomNavItem.PersonItem,
			BottomNavItem.GroupItem,
			BottomNavItem.SettingItem
		),
		navController = navController,
		onItemClick = {
			navController.navigate(it.route) {
				// Pop up to the start destination of the graph to
				// avoid building up a large stack of destinations
				navController.graph.startDestinationRoute?.let { route ->
					popUpTo(route) {
						saveState = true
					}
				}

				//Avoid multiple copies of the same destination when
				//re selecting the same item
				launchSingleTop = true

				//Restore state when re selecting a previously selected item
				// Если этот параметр включен, то при обновлении состояния
				// viewModel, состояние экрана не изменится при переключении

				restoreState = true

			}
		}
	)
}

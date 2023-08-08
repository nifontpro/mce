package ru.nb.mce.ui.navigation

import androidx.compose.runtime.Composable

@Composable
fun BottomBar(
	onItemClick: (String) -> Unit,
	isSelectItem: (String) -> Boolean,
) {

	BottomNavigationBar(
		items = listOf(
			BottomNavItem.EventItem,
			BottomNavItem.PersonItem,
			BottomNavItem.GroupItem,
			BottomNavItem.SettingItem
		),
		onItemClick = onItemClick,
		isSelectItem = isSelectItem
	)
}

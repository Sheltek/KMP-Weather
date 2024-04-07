package com.br.kmpdemo.ui.app

import androidx.compose.material3.Text
import com.br.kmpdemo.NavRoutes
import com.sheltek.kwikstart.compose.navigation.utils.NavigationItem

val kmpDemoAppNavItems = listOf<NavigationItem>(
    NavigationItem(
        route = NavRoutes.HOME,
        selectedIcon = {},
        unselectedIcon = {},
        label = { Text("Home") },
        onClick = {},
    ),
    NavigationItem(
        route = NavRoutes.MAP,
        selectedIcon = {},
        unselectedIcon = {},
        label = { Text("Location") },
        onClick = {},
    ),
    NavigationItem(
        route = NavRoutes.ADD,
        selectedIcon = {},
        unselectedIcon = {},
        label = { Text("Add") },
        onClick = {},
    ),
    NavigationItem(
        route = NavRoutes.LIST,
        selectedIcon = {},
        unselectedIcon = {},
        label = { Text("List") },
        onClick = {},
    )
)

package com.br.kmmdemo.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.fragment.app.FragmentActivity
import com.bottlerocketstudios.launchpad.compose.navigation.NavigationWrapper
import com.bottlerocketstudios.launchpad.compose.navigation.util.createDevicePostureFlow
import com.bottlerocketstudios.launchpad.compose.navigation.util.getWindowWidthSize
import com.bottlerocketstudios.launchpad.compose.navigation.utils.DevicePosture
import com.bottlerocketstudios.launchpad.compose.navigation.utils.NavigationItem
import com.br.kmmdemo.NavRoutes
import com.br.kmmdemo.theme.KMMTheme
import kotlinx.coroutines.flow.StateFlow
import moe.tlaster.precompose.PreComposeApp
import org.koin.core.component.KoinComponent

class MainActivity : FragmentActivity(), KoinComponent {
    private val devicePostureFlow: StateFlow<DevicePosture> = createDevicePostureFlow()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreComposeApp {
                KMMTheme {
                    NavigationWrapper(
                        widthSize = getWindowWidthSize(this@MainActivity),
                        devicePosture = devicePostureFlow.collectAsState().value,
                        navigationItems = kmpNavItems,
                    ) { navigator, bottomBar ->

                    }
                }
            }
        }
    }
}

val kmpNavItems = listOf<NavigationItem>(
    NavigationItem(
        route = NavRoutes.HOME,
        selectedIcon = {},
        unselectedIcon = {},
        label = { Text("Home") },
        onClick = {},
    ),
    NavigationItem(
        route = NavRoutes.LOCATION,
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
),


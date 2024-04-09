package com.sheltek.kmpweather.ui.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sheltek.kmpweather.MainWindowControlsImplementation
import com.sheltek.kmpweather.NavRoutes
import com.sheltek.kmpweather.mainNavGraph
import com.sheltek.kmpweather.viewmodels.MainActivityViewModel
import com.sheltek.kwikstart.compose.navigation.utils.DevicePosture
import com.sheltek.kwikstart.compose.navigation.utils.WindowWidthSizeClass
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import moe.tlaster.precompose.viewmodel.viewModel

@Composable
fun KmpWeatherApp(
    widthSize: WindowWidthSizeClass,
    navigator: Navigator?,
    devicePosture: DevicePosture,
    bottomBar: @Composable () -> Unit,
) {
    val activityViewModel = viewModel(modelClass = MainActivityViewModel::class) {
        MainActivityViewModel()
    }
    val windowControls by lazy { MainWindowControlsImplementation(activityViewModel) }

    Scaffold(
        topBar = {},
        bottomBar = {
            if (!windowControls.hideNavBar && navigator != null) bottomBar()
        },
    ) {
        navigator?.let { navController ->
            NavHost(
                // Assign the navigator to the NavHost
                navigator = navController,
                // Navigation transition for the scenes in this NavHost, this is optional
                navTransition = NavTransition(),
                // The start destination
                initialRoute = NavRoutes.HOME,
                modifier = Modifier.padding(it)
            ) {
                mainNavGraph(
                    navigator = navController,
                    windowControls = windowControls,
                    widthSizeClass = widthSize,
                    devicePosture = devicePosture
                )
            }
        }
    }
}
package com.sheltek.kmpweather

import androidx.compose.runtime.Composable
import com.sheltek.kmpweather.ui.home.homeComposable
import com.sheltek.kwikstart.compose.navigation.utils.DevicePosture
import com.sheltek.kwikstart.compose.navigation.utils.WindowWidthSizeClass
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder

fun RouteBuilder.mainNavGraph(
    navigator: Navigator,
    windowControls: MainWindowControls?,
    widthSizeClass: WindowWidthSizeClass,
    devicePosture: DevicePosture,
) {
    homeComposable(navigator)
}

@Composable
expect fun WeatherMapScreen()
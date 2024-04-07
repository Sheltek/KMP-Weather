package com.br.kmpdemo

import androidx.compose.runtime.Composable
import com.br.kmpdemo.ui.home.homeComposable
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
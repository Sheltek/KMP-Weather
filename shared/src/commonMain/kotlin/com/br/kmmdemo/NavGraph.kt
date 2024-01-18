package com.br.kmmdemo

import androidx.compose.runtime.Composable
import com.br.kmmdemo.ui.home.homeComposable
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder

//fun RouteBuilder.navGraph() {
//    scene("/home", navTransition = NavTransition()) {
//        val viewModel: ViewModel1 = koinViewModel(vmClass = ViewModel1::class)
//        HomeScreen()
//    }
//    scene("/map", navTransition = NavTransition()) {
//        WeatherMapScreen()
//    }
//}

fun RouteBuilder.mainNavGraph(
    navigator: Navigator
) {
    homeComposable(navigator)
}

@Composable
expect fun WeatherMapScreen()
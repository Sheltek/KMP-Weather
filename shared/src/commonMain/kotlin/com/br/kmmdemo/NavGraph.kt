package com.br.kmmdemo

import moe.tlaster.precompose.koin.koinViewModel
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModel

class ViewModel1 : ViewModel() {

}

fun RouteBuilder.navGraph() {
    scene("/home", navTransition = NavTransition()) {
//        val viewModel: ViewModel1 = koinViewModel(vmClass = ViewModel1::class)
        HomeScreen()
    }
    scene("/map", navTransition = NavTransition()) {
        MapScreen()
    }
}
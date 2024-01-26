package com.br.kmmdemo.ui.home

import com.br.kmmdemo.network.Routes
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition
import moe.tlaster.precompose.viewmodel.viewModel

fun RouteBuilder.homeComposable(navigator: Navigator) {
    scene(route = Routes.HOME, navTransition = NavTransition()) {

        val homeViewModel = viewModel(HomeViewModel::class) {
            HomeViewModel()
        }

        val state: HomeState = homeViewModel.toState()

        HomeScreen(state)
    }
}
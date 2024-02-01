package com.br.kmmdemo.ui.home

import com.br.kmmdemo.NavRoutes
import com.br.kmmdemo.compose.ui.home.HomeBottomSheetScaffold
import com.br.kmmdemo.compose.ui.home.HomeState
import com.br.kmmdemo.viewmodels.HomeViewModel
import com.br.kmmdemo.viewmodels.converters.toState
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.transition.NavTransition
import moe.tlaster.precompose.viewmodel.viewModel

fun RouteBuilder.homeComposable(navigator: Navigator) {
    scene(route = NavRoutes.HOME, navTransition = NavTransition()) {
        val homeViewModel = viewModel(HomeViewModel::class) {
            HomeViewModel()
        }

        val state: HomeState = homeViewModel.toState()

        HomeBottomSheetScaffold(state)
    }
}
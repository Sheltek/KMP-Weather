package com.sheltek.kmpweather.ui.home

import com.sheltek.kmpweather.NavRoutes
import com.sheltek.kmpweather.compose.ui.home.HomeBottomSheetScaffold
import com.sheltek.kmpweather.compose.ui.home.HomeState
import com.sheltek.kmpweather.viewmodels.HomeViewModel
import com.sheltek.kmpweather.viewmodels.converters.toState
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
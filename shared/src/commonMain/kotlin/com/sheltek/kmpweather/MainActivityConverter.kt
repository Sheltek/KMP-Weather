package com.sheltek.kmpweather

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.sheltek.kmpweather.ui.app.KmpWeatherAppState
import com.sheltek.kmpweather.viewmodels.MainActivityViewModel

@Composable
fun MainActivityViewModel.toState() = KmpWeatherAppState(
    appTitle = appTitle.collectAsState().value,
    hideNavBar = hideNavBar.collectAsState().value,
)
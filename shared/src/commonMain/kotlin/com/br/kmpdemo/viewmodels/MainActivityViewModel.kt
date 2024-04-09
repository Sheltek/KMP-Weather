package com.br.kmpdemo.viewmodels

import BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import com.sheltek.kmpweather.compose.SharedRes

class MainActivityViewModel: BaseViewModel() {
    val appTitle = MutableStateFlow(SharedRes.strings.appName)
    val hideNavBar = MutableStateFlow(false)
}
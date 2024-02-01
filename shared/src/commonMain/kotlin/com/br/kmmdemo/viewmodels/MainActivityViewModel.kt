package com.br.kmmdemo.viewmodels

import BaseViewModel
import com.br.kmmdemo.compose.resources.SharedRes
import kotlinx.coroutines.flow.MutableStateFlow

class MainActivityViewModel: BaseViewModel() {
    val appTitle = MutableStateFlow(SharedRes.strings.appName)
    val hideNavBar = MutableStateFlow(false)
}
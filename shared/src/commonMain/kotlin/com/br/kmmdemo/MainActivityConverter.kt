package com.br.kmmdemo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.br.kmmdemo.ui.app.KmpDemoAppState
import com.br.kmmdemo.viewmodels.MainActivityViewModel

@Composable
fun MainActivityViewModel.toState() = KmpDemoAppState(
    appTitle = appTitle.collectAsState().value,
    hideNavBar = hideNavBar.collectAsState().value,
)
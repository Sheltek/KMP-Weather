package com.br.kmmdemo.android

import android.os.Bundle
import androidx.compose.ui.platform.LocalConfiguration
import com.br.kmmdemo.main.MainView
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent
import org.koin.core.component.KoinComponent

class MainActivity : PreComposeActivity(), KoinComponent {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView(LocalConfiguration.current.screenWidthDp)
        }
    }
}


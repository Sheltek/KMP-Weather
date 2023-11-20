package com.br.kmmdemo.android

import android.os.Bundle
import com.br.kmmdemo.Platform
import com.br.kmmdemo.main.MainView
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainActivity : PreComposeActivity(), KoinComponent {
    val platform: Platform by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView(platform.screenSize())
        }
    }
}


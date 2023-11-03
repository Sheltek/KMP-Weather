package com.br.kmmdemo.android

import android.os.Bundle
import com.br.kmmdemo.main.MainView
import com.br.kmmdemo.main.WeatherMapView
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent

class MainActivity : PreComposeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView()
        }
    }
}


package com.br.kmmdemo.android

import android.os.Bundle
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.platform.LocalConfiguration
import com.br.kmmdemo.App
import com.br.kmmdemo.theme.SMALL_SCREEN_WIDTH_DP
import com.br.kmmdemo.theme.smallDimensions
import com.br.kmmdemo.theme.sw360Dimensions
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent
import org.koin.core.component.KoinComponent

class MainActivity : PreComposeActivity(), KoinComponent {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(
                darkTheme = isSystemInDarkTheme(),
                dimensions = if (LocalConfiguration.current.screenWidthDp <= SMALL_SCREEN_WIDTH_DP) smallDimensions else sw360Dimensions
            )
        }
    }
}


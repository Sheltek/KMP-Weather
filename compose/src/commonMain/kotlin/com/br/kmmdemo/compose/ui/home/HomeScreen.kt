package com.br.kmmdemo.compose.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.br.kmmdemo.compose.resources.SharedRes
import com.br.kmmdemo.compose.resources.theme.Colors
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun HomeScreen(state: HomeState) {
    Surface(
        color = Colors.primary,
        modifier = Modifier.fillMaxSize(),
        content = {
            Image(
                painter = painterResource(SharedRes.images.night_landscape),
                contentDescription = stringResource(SharedRes.strings.home_bg),
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth,
            )

            HomeCurrentWeather(state)
        }
    )
}
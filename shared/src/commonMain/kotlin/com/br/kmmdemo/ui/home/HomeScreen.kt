package com.br.kmmdemo.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Colors
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
                contentScale = ContentScale.FillBounds,
            )

            HomeCurrentWeather(state)

            NavBar()
        }
    )
}
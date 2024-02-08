package com.br.kmmdemo.compose.ui.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.br.kmmdemo.compose.resources.SharedRes
import com.br.kmmdemo.compose.resources.theme.Colors
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(state: HomeState, sheetState: SheetState) {
    Surface(
        color = Colors.primaryContainer,
        modifier = Modifier.fillMaxSize(),
        content = {
            AnimatedVisibility(
                visible = sheetState.currentValue == SheetValue.PartiallyExpanded,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Image(
                    painter = painterResource(SharedRes.images.night_landscape),
                    contentDescription = stringResource(SharedRes.strings.home_bg),
                    alignment = Alignment.Center,
                    contentScale = ContentScale.FillWidth,
                )
            }
            HomeCurrentWeather(state, sheetState)
        }
    )
}
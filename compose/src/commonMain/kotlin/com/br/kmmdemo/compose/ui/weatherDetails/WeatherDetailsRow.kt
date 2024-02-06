package com.br.kmmdemo.compose.ui.weatherDetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.br.kmmdemo.compose.resources.theme.Dimens

@Composable
fun WeatherDetailsRow(content: @Composable () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = Dimens.grid_0_5,
                end = Dimens.grid_0_5,
                top = Dimens.grid_1_5
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        content = { content() }
    )
}
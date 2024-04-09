package com.sheltek.kmpweather.compose.ui.weatherDetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sheltek.kmpweather.compose.resources.theme.Dimens

@Composable
fun WeatherDetailsRow(content: @Composable () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = Dimens.grid_2_5),
        horizontalArrangement = Arrangement.SpaceBetween,
        content = { content() }
    )
}
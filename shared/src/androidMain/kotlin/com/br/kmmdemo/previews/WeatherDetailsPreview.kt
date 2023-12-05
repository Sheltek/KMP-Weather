package com.br.kmmdemo.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityWidget

@Composable
@Preview
fun `Air Quality Preview`() {
    KMMTheme {
        Column {
            AirQualityWidget(AirQualityEnum.MAROON)
            AirQualityWidget(AirQualityEnum.YELLOW)
            // No Air Quality Info Returned
            AirQualityWidget(AirQualityEnum.UNKNOWN)
        }
    }
}
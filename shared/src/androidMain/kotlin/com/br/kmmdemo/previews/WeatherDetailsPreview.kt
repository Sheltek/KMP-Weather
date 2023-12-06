package com.br.kmmdemo.previews

import FeelsLikeWidget
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityWidget
import com.br.kmmdemo.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UvIndexWidget

@Composable
@Preview
fun `Air Quality Preview`() {
    KMMTheme {
        Column {
            AirQualityWidget(AirQualityEnum.YELLOW)
            // No Air Quality Info Returned
            AirQualityWidget(AirQualityEnum.UNKNOWN)
        }
    }
}

@Composable
@Preview
fun `UV Index Preview`() {
    KMMTheme {
        Row {
            UvIndexWidget(UVIndexEnum.MODERATE)
            UvIndexWidget(UVIndexEnum.UNKNOWN)
        }
    }
}

@Composable
@Preview
fun `Feels Like Preview`() {
    KMMTheme {
        Row {
            FeelsLikeWidget(FeelsLikeState(75.0, 65.0))
            FeelsLikeWidget(FeelsLikeState(null, 59.0))
        }
    }
}
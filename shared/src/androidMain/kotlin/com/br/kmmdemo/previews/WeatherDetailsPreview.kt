package com.br.kmmdemo.previews

import FeelsLikeWidget
import VisibilityWidget
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityWidget
import com.br.kmmdemo.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityState
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityWidget
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallState
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallWidget
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UvIndexWidget
import com.br.kmmdemo.ui.weatherDetails.visibility.VisibilityState

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

@Composable
@Preview
fun `Humidity Preview`() {
    KMMTheme {
        Row {
            HumidityWidget(HumidityState(90.0, 17.0))
            HumidityWidget(HumidityState(null, null))
        }
    }
}

@Composable
@Preview
fun `Rain Fall Preview`() {
    KMMTheme {
        Row {
            RainFallWidget(RainFallState("1.8 mm", "1.2 mm"))
            RainFallWidget(RainFallState())
        }
    }
}

@Composable
@Preview
fun `Visibility Preview`() {
    KMMTheme {
        Row {
            VisibilityWidget(VisibilityState("8 km", true))
            VisibilityWidget(VisibilityState())
        }
    }
}
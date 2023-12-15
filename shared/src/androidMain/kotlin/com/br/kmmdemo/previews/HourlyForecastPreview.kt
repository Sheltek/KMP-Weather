package com.br.kmmdemo.previews

import ForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.forecasts.ForecastState
import com.br.kmmdemo.ui.forecasts.HourlyForecastChip
import com.br.kmmdemo.ui.forecasts.WeatherEnum

val hourlyForecast = ForecastState(
    dayTime = "12 PM",
    precipProbability = "30%",
    temperature = "29\u00B0",
    weatherIcon = WeatherEnum.DAY_SNOW,
)

@Composable
@Preview
fun PreviewNowHourlyForecast() {
    KMMTheme {
        ForecastChip(state = hourlyForecast.copy(isNow = true)) { state ->
            HourlyForecastChip(state)
        }
    }
}

@Composable
@Preview
fun PreviewHourlyForecast() {
    KMMTheme {
        ForecastChip(state = hourlyForecast) { state ->
            HourlyForecastChip(state)
        }
    }
}

@Composable
@Preview
fun PreviewHourlyForecastERROR() {
    val errorForecast = ForecastState(weatherIcon = WeatherEnum.WINDY)
    KMMTheme {
        ForecastChip(state = errorForecast) { state ->
            HourlyForecastChip(state)
        }
    }
}
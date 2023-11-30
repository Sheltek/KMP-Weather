package com.br.kmmdemo.previews

import ForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.ForecastState
import com.br.kmmdemo.forecasts.HourlyForecastChip
import com.br.kmmdemo.forecasts.WeatherEnum
import com.br.kmmdemo.theme.KMMTheme

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
        val forecast = hourlyForecast.copy(isNow = true)
        ForecastChip(state = forecast) { HourlyForecastChip(state = forecast) }
    }
}

@Composable
@Preview
fun PreviewHourlyForecast() {
    KMMTheme {
        ForecastChip(state = hourlyForecast) { HourlyForecastChip(state = hourlyForecast) }
    }
}
package com.br.kmmdemo.previews

import com.br.kmmdemo.forecasts.HourlyForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.HourlyForecastState
import com.br.kmmdemo.forecasts.WeatherEnum
import com.br.kmmdemo.resources.SharedRes

val hourlyForecast = HourlyForecastState(
    time = "12 PM",
    precipProbability = "30%",
    temperature = "29\u00B0",
    weatherIcon = WeatherEnum.DAY_SNOW,
)

@Composable
@Preview
fun PreviewNowHourlyForecast() {
    val forecast = hourlyForecast.copy(isNow = true)
    HourlyForecastChip(state = forecast)
}

@Composable
@Preview
fun PreviewHourlyForecast() {
    HourlyForecastChip(state = hourlyForecast)
}
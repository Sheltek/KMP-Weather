package com.br.kmmdemo.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.DailyForecastChip
import com.br.kmmdemo.forecasts.DailyForecastState
import com.br.kmmdemo.forecasts.WeatherEnum

private val dailyForecast = DailyForecastState(
    day = "TUE",
    precipProbability = "30%",
    temperature = "63\u00B0",
    weatherIcon = WeatherEnum.DAY_FOG,
)

@Composable
@Preview
fun PreviewTodayDailyForecast() {
    val forecast = dailyForecast.copy(isToday = true)
    DailyForecastChip(state = forecast)
}

@Composable
@Preview
fun PreviewDailyForecast() {
    DailyForecastChip(state = dailyForecast)
}
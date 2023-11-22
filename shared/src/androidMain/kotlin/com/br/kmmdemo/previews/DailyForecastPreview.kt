package com.br.kmmdemo.previews

import com.br.kmmdemo.forecasts.DailyForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.DailyForecastState
import com.br.kmmdemo.resources.SharedRes

private val dailyForecast = DailyForecastState(
    day = "TUE",
    precipProbability = "30%",
    temperature = "20\u00B0",
    weatherIcon = SharedRes.images.moon_cloud_mid_rain,
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
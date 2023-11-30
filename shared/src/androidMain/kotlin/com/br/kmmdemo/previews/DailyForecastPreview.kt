package com.br.kmmdemo.previews

import ForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.DailyForecastChip
import com.br.kmmdemo.forecasts.ForecastState
import com.br.kmmdemo.forecasts.WeatherEnum
import com.br.kmmdemo.theme.KMMTheme

private val dailyForecast = ForecastState(
    dayTime = "TUE",
    precipProbability = "30%",
    temperature = "63\u00B0",
    weatherIcon = WeatherEnum.DAY_FOG,
)

@Composable
@Preview
fun `Preview Today Daily Forecast`() {
    val forecast = dailyForecast.copy(isNow = true)
    KMMTheme {
        ForecastChip(state = forecast) { DailyForecastChip(forecast) }
    }
}


@Composable
@Preview
fun `Preview Daily Forecast`() =
    KMMTheme {
        ForecastChip(state = dailyForecast) { DailyForecastChip(state = dailyForecast)}
    }

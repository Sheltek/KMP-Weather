package com.br.kmmdemo.previews

import ForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.ui.forecasts.DailyForecastChip
import com.br.kmmdemo.ui.forecasts.ForecastState
import com.br.kmmdemo.ui.forecasts.WeatherEnum
import com.br.kmmdemo.theme.KMMTheme

private val dailyForecast = ForecastState(
    dayTime = "TUE",
    precipProbability = "30%",
    temperature = "63\u00B0",
    weatherIcon = WeatherEnum.DAY_FOG,
)

@Composable
@Preview
fun `Preview Today Daily Forecast`() =
    KMMTheme {
        ForecastChip(state = dailyForecast.copy(isNow = true)) { state ->
            DailyForecastChip(state)
        }
    }

@Composable
@Preview
fun `Preview Daily Forecast`() =
    KMMTheme {
        ForecastChip(state = dailyForecast) { state ->
            DailyForecastChip(state)
        }
    }

@Composable
@Preview
fun `Preview Daily Forecast ERROR`() =
    KMMTheme {
        val errorForecast = ForecastState(weatherIcon = WeatherEnum.HAIL)
        ForecastChip(state = errorForecast) { state ->
            DailyForecastChip(state)
        }
    }

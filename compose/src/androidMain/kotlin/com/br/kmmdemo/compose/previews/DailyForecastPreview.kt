package com.br.kmmdemo.compose.previews

import ForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.compose.resources.theme.KMMTheme
import com.br.kmmdemo.compose.ui.forecasts.DailyForecastChip
import com.br.kmmdemo.compose.ui.forecasts.ForecastState
import com.br.kmmdemo.compose.ui.forecasts.WeatherEnum


private val dailyForecast = ForecastState(
    dayTime = "TUE",
    precipProbability = "30%",
    temperature = "63\u00B0",
    weatherIcon = WeatherEnum.DAY_FOG,
)

@Composable
@Preview
fun PreviewTodayDailyForecast() =
    KMMTheme {
        ForecastChip(state = dailyForecast.copy(isNow = true)) { state ->
            DailyForecastChip(state)
        }
    }

@Composable
@Preview
fun PreviewDailyForecast() =
    KMMTheme {
        ForecastChip(state = dailyForecast) { state ->
            DailyForecastChip(state)
        }
    }

@Composable
@Preview
fun PreviewDailyForecastERROR() =
    KMMTheme {
        val errorForecast = ForecastState(weatherIcon = WeatherEnum.HAIL)
        ForecastChip(state = errorForecast) { state ->
            DailyForecastChip(state)
        }
    }

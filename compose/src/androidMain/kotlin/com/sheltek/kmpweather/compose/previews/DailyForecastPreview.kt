package com.sheltek.kmpweather.compose.previews

import ForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.resources.theme.KmpWeatherTheme
import com.sheltek.kmpweather.compose.ui.forecasts.DailyForecastChip
import com.sheltek.kmpweather.compose.ui.forecasts.ForecastState
import com.sheltek.kmpweather.compose.ui.forecasts.WeatherEnum


private val dailyForecast = ForecastState(
    dayTime = "TUE",
    precipProbability = 30,
    temperature = 63,
    weatherIcon = WeatherEnum.DAY_FOG,
)

@Composable
@Preview
fun PreviewTodayDailyForecast() =
    KmpWeatherTheme {
        ForecastChip(state = dailyForecast.copy(isNow = true)) { state ->
            DailyForecastChip(state)
        }
    }

@Composable
@Preview
fun PreviewDailyForecast() =
    KmpWeatherTheme {
        ForecastChip(state = dailyForecast) { state ->
            DailyForecastChip(state)
        }
    }

@Composable
@Preview
fun PreviewDailyForecastERROR() =
    KmpWeatherTheme {
        val errorForecast = ForecastState(weatherIcon = WeatherEnum.HAIL)
        ForecastChip(state = errorForecast) { state ->
            DailyForecastChip(state)
        }
    }

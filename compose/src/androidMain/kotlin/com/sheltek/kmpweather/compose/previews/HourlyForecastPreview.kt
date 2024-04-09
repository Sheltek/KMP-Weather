package com.sheltek.kmpweather.compose.previews

import ForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.resources.theme.KmpDemoTheme
import com.sheltek.kmpweather.compose.ui.forecasts.ForecastState
import com.sheltek.kmpweather.compose.ui.forecasts.HourlyForecastChip
import com.sheltek.kmpweather.compose.ui.forecasts.WeatherEnum

val hourlyForecast = ForecastState(
    dayTime = "12 PM",
    precipProbability = 30,
    temperature = 29,
    weatherIcon = WeatherEnum.DAY_SNOW,
)

@Composable
@Preview
fun PreviewNowHourlyForecast() {
    KmpDemoTheme {
        ForecastChip(state = hourlyForecast.copy(isNow = true)) { state ->
            HourlyForecastChip(state)
        }
    }
}

@Composable
@Preview
fun PreviewHourlyForecast() {
    KmpDemoTheme {
        ForecastChip(state = hourlyForecast) { state ->
            HourlyForecastChip(state)
        }
    }
}

@Composable
@Preview
fun PreviewHourlyForecastERROR() {
    val errorForecast = ForecastState(weatherIcon = WeatherEnum.WINDY)
    KmpDemoTheme {
        ForecastChip(state = errorForecast) { state ->
            HourlyForecastChip(state)
        }
    }
}
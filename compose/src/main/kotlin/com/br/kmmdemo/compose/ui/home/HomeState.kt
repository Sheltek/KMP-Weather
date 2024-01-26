package com.br.kmmdemo.compose.ui.home

import com.br.kmmdemo.compose.ui.forecasts.ForecastState
import com.br.kmmdemo.compose.ui.weatherDetails.WeatherDetailsState

data class HomeState(
    // Home Weather Overlay
    val location: String? = null,
    val currentTemp: String? = null,
    val weatherDescription: String? = null,
    val tempHigh: String? = null,
    val tempLow: String? = null,

    // Weather Details
    val hourlyForecasts: List<ForecastState>,
    val weeklyForecasts: List<ForecastState>,
    val weatherDetailsState: WeatherDetailsState
)

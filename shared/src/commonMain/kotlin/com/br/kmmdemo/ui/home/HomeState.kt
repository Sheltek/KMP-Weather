package com.br.kmmdemo.ui.home

import com.br.kmmdemo.ui.forecasts.ForecastState
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsState

data class HomeState(
    val location: String? = null,
    val currentTemp: String? = null,
    val weatherDescription: String? = null,
    val tempHigh: String? = null,
    val tempLow: String? = null,
    val hourlyForecasts: List<ForecastState>,
    val weeklyForecasts: List<ForecastState>,
    val weatherDetailsState: WeatherDetailsState
)

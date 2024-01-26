package com.br.kmmdemo.compose.ui.forecasts

data class WeatherWidgetState(
    val tempCurrent: String? = null,
    val tempHighLow: String? = null,
    val location: String? = null,
    val weatherIcon: WeatherEnum,
)

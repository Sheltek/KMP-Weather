package com.sheltek.kmpweather.compose.ui.weatherDetails.wind

data class WindState(
    val windDirection: WindDirectionEnum? = null,
    val windGust: Double? = null,
    val windSpeed: String? = null,
)

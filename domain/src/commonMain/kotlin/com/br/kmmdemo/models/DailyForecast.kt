package com.br.kmmdemo.models

data class DailyForecast(
    val date: String,
    val weatherIconRes: String,
    val weatherDescription: String,
    val highTemp: Int,
    val lowTemp: Int,
    val windSpeed: Int,
    val windDirection: String,
    val humidity: Int
)

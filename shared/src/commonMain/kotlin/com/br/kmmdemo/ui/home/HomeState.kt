package com.br.kmmdemo.ui.home

data class HomeState(
    val location: String? = null,
    val currentTemp: String? = null,
    val weatherDescription: String? = null,
    val tempHigh: String? = null,
    val tempLow: String? = null,
)

package com.br.kmmdemo.forecasts

import dev.icerock.moko.resources.ImageResource

data class HourlyForecastState(
    val time: String? = null,
    val precipProbability: String? = null,
    val temperature: String? = null,
    val weatherIcon: WeatherEnum,
    val isNow: Boolean = false,
)
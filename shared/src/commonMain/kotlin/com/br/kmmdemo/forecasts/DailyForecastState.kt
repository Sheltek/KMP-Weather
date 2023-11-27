package com.br.kmmdemo.forecasts

import dev.icerock.moko.resources.ImageResource

data class DailyForecastState(
    val day: String? = null,
    val precipProbability: String? = null,
    val temperature: String? = null,
    val weatherIcon: WeatherEnum,
    val isToday: Boolean = false,
)

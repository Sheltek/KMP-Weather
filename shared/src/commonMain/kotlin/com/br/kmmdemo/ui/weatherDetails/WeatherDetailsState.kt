package com.br.kmmdemo.ui.weatherDetails

import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum

data class WeatherDetailsState(
    val airQuality: AirQualityEnum,
    val uvIndex: UVIndexEnum
)
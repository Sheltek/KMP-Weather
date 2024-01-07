package com.br.kmmdemo.ui.weatherDetails

import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityState
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallState
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum

data class WeatherDetailsState(
    val airQuality: AirQualityEnum,
    val feelsLikeState: FeelsLikeState,
    val humidityState: HumidityState,
    val rainFallState: RainFallState,
    val uvIndex: UVIndexEnum,
)
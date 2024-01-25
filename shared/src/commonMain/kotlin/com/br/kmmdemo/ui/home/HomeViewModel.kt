package com.br.kmmdemo.ui.home

import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityState
import com.br.kmmdemo.ui.weatherDetails.pressure.BarometricPressureState
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallState
import com.br.kmmdemo.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum
import com.br.kmmdemo.ui.weatherDetails.visibility.VisibilityState
import com.br.kmmdemo.ui.weatherDetails.wind.WindState
import kotlinx.coroutines.flow.MutableStateFlow
import moe.tlaster.precompose.viewmodel.ViewModel

class HomeViewModel: ViewModel() {
    // Home Weather Overlay
    val location = MutableStateFlow<String?>(null)
    val currentTemp = MutableStateFlow<String?>(null)
    val weatherDescription = MutableStateFlow<String?>(null)
    val tempHigh = MutableStateFlow<String?>(null)
    val tempLow = MutableStateFlow<String?>(null)

    // Weather Details
    val airQualityState = MutableStateFlow(AirQualityEnum.UNKNOWN)
    val feelsLikeState = MutableStateFlow<FeelsLikeState?>(null)
    val humidityState = MutableStateFlow<HumidityState?>(null)
    val barometricPressureState = MutableStateFlow<BarometricPressureState?>(null)
    val rainFallState = MutableStateFlow<RainFallState?>(null)
    val sunriseSunsetState = MutableStateFlow<SunriseSunsetState?>(null)
    val uvIndexState = MutableStateFlow(UVIndexEnum.UNKNOWN)
    val visibilityState = MutableStateFlow<VisibilityState?>(null)
    val windState = MutableStateFlow<WindState?>(null)
}
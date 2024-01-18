package com.br.kmmdemo.ui.home

import androidx.compose.runtime.State
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityState
import com.br.kmmdemo.ui.weatherDetails.pressure.BarometricPressureState
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallState
import com.br.kmmdemo.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum
import com.br.kmmdemo.ui.weatherDetails.visibility.VisibilityState
import com.br.kmmdemo.ui.weatherDetails.wind.WindState

data class HomeState(
    // Home Weather Overlay
    val location: State<String?>,
    val currentTemp: State<String?>,
    val weatherDescription: State<String?>,
    val tempHigh: State<String?>,
    val tempLow: State<String?>,

    // Weather Details
    val airQualityState: State<AirQualityEnum>,
    val feelsLikeState: State<FeelsLikeState?>,
    val humidityState: State<HumidityState?>,
    val barometricPressureState: State<BarometricPressureState?>,
    val rainFallState: State<RainFallState?>,
    val sunriseSunsetState: State<SunriseSunsetState?>,
    val uvIndexState: State<UVIndexEnum>,
    val visibilityState: State<VisibilityState?>,
    val windState: State<WindState?>
)

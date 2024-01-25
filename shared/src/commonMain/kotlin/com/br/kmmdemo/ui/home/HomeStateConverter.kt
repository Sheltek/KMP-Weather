package com.br.kmmdemo.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum

@Composable
fun HomeViewModel.toState() = HomeState(
    location = location.collectAsState(null),
    currentTemp = currentTemp.collectAsState(null),
    weatherDescription = weatherDescription.collectAsState(null),
    tempHigh = tempHigh.collectAsState(null),
    tempLow = tempLow.collectAsState(null),
    airQualityState = airQualityState.collectAsState(AirQualityEnum.UNKNOWN),
    feelsLikeState = feelsLikeState.collectAsState(null),
    humidityState = humidityState.collectAsState(null),
    barometricPressureState = barometricPressureState.collectAsState(null),
    rainFallState = rainFallState.collectAsState(null),
    sunriseSunsetState = sunriseSunsetState.collectAsState(null),
    uvIndexState = uvIndexState.collectAsState(UVIndexEnum.UNKNOWN),
    visibilityState = visibilityState.collectAsState(null),
    windState = windState.collectAsState(null),
)
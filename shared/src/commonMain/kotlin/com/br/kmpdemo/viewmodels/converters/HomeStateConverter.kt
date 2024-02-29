package com.br.kmpdemo.viewmodels.converters

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.br.kmpdemo.compose.ui.home.HomeState
import com.br.kmpdemo.viewmodels.HomeViewModel

@Composable
fun HomeViewModel.toState() = HomeState(
    // Forecasts
    hourlyForecasts = hourlyForecasts.collectAsState(initForecasts).value,
    dailyForecasts = dailyForecasts.collectAsState(initForecasts).value,
    realTimeWeather = realTimeResponse.collectAsState(null).value,

    // Weather Details
    location = location.collectAsState().value,
    temperature = currentTemp.collectAsState().value,
    temperatureHi = currentTempHi.collectAsState().value,
    temperatureLow = currentTempLow.collectAsState().value,
    weatherDescription = weatherDescription.collectAsState().value,
    airQuality = airQuality.collectAsState().value,
    feelsLikeState = feelsLikeState.collectAsState().value,
    humidityState = humidityState.collectAsState().value,
    pressureState = pressureState.collectAsState().value,
    rainFallState = rainFallState.collectAsState().value,
    sunriseSunsetState = sunriseSunsetState.collectAsState().value,
    uvIndexState = uvIndexState.collectAsState().value,
    visibilityState = visibilityState.collectAsState().value,
    windState = windState.collectAsState().value,
)
package com.br.kmpdemo.compose.ui.home

import com.br.kmpdemo.compose.ui.forecasts.ForecastState
import com.br.kmpdemo.compose.ui.forecasts.WeatherEnum
import com.br.kmpdemo.compose.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmpdemo.compose.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmpdemo.compose.ui.weatherDetails.humidity.HumidityState
import com.br.kmpdemo.compose.ui.weatherDetails.pressure.BarometricPressureState
import com.br.kmpdemo.compose.ui.weatherDetails.rainFall.RainFallState
import com.br.kmpdemo.compose.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.br.kmpdemo.compose.ui.weatherDetails.uvIndex.UVIndexEnum
import com.br.kmpdemo.compose.ui.weatherDetails.visibility.VisibilityState
import com.br.kmpdemo.compose.ui.weatherDetails.wind.WindState
import com.br.kmpdemo.models.RealTime

data class HomeState(
    /// Forecasts
    val hourlyForecasts: List<ForecastState>?,
    val dailyForecasts: List<ForecastState>?,
    val realTimeWeather: RealTime?,

    /// Weather Details
    val location: String? = null,
    val temperature: Int? = null,
    val temperatureHi: Int? = null,
    val temperatureLow: Int? = null,
    val weatherDescription: WeatherEnum? = null,
    val airQuality: AirQualityEnum? = null,
    val feelsLikeState: FeelsLikeState? = null,
    val humidityState: HumidityState? = null,
    val pressureState: BarometricPressureState? = null,
    val rainFallState: RainFallState? = null,
    val sunriseSunsetState: SunriseSunsetState? = null,
    val uvIndexState: UVIndexEnum? = null,
    val visibilityState: VisibilityState? = null,
    val windState: WindState? = null
)
package com.br.kmmdemo.previews.utils

import com.br.kmmdemo.ui.forecasts.ForecastState
import com.br.kmmdemo.ui.forecasts.WeatherEnum
import com.br.kmmdemo.ui.home.HomeState
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsState
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityEnum
import com.br.kmmdemo.ui.weatherDetails.feelsLike.FeelsLikeState
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityState
import com.br.kmmdemo.ui.weatherDetails.pressure.BarometricPressureState
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallState
import com.br.kmmdemo.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UVIndexEnum
import com.br.kmmdemo.ui.weatherDetails.visibility.VisibilityState
import com.br.kmmdemo.ui.weatherDetails.wind.WindDirection
import com.br.kmmdemo.ui.weatherDetails.wind.WindState
import kotlin.random.Random

object MockData {
    private val weekdays = listOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
    private val hours = (1..12).map { "$it AM" }.toMutableList()
    fun getMockWeeklyForecast(): List<ForecastState> {
        val nowIndex = Random.nextInt(from = 0, until = weekdays.lastIndex)
        return weekdays.map {
            ForecastState(
                dayTime = it,
                precipProbability = getMockPrecipProbability(),
                temperature = getMockTemp(),
                weatherIcon = getMockRandomIcon(),
                isNow = weekdays.indexOf(it) == nowIndex
            )
        }.toList()
    }

    fun getMockHourlyForecast(): List<ForecastState> {
        val nowIndex = Random.nextInt(from = 0, until = hours.lastIndex)
        return hours.map {
            ForecastState(
                dayTime = it,
                precipProbability = getMockPrecipProbability(),
                temperature = getMockTemp(),
                weatherIcon = getMockRandomIcon(),
                isNow = hours.indexOf(it) == nowIndex
            )
        }.toList()
    }

    fun getMockPrecipProbability(): String {
        return "${Random.nextInt(from = 0, until = 99)}%"
    }

    fun getMockTemp(): String {
        return "${Random.nextInt(from = 0, until = 115)}\u00B0"
    }

    fun getMockRandomIcon(): WeatherEnum {
        return WeatherEnum.values().random()
    }

    fun getMockHomeState(isError: Boolean = false): HomeState {
        if (isError) return HomeState(
            hourlyForecasts = getMockHourlyForecast(),
            weeklyForecasts = getMockWeeklyForecast(),
            weatherDetailsState = WeatherDetailsState(
                airQuality = AirQualityEnum.UNKNOWN,
                feelsLikeState = FeelsLikeState(null, 65.0),
                humidityState = HumidityState(null, null),
                pressureState = BarometricPressureState(pressure = 0.0F),
                rainFallState = RainFallState(),
                sunriseSunsetState = SunriseSunsetState(
                    localTime = null,
                    sunriseTime = null,
                    sunsetTime = null
                ),
                uvIndexState = UVIndexEnum.UNKNOWN,
                visibilityState = VisibilityState(),
                windState = WindState(windDirection = WindDirection.N),
            ),
        )

        return HomeState(
            location = "Montreal",
            currentTemp = "19",
            weatherDescription = "Mostly Clear",
            tempHigh = "24",
            tempLow = "18",
            hourlyForecasts = getMockHourlyForecast(),
            weeklyForecasts = getMockWeeklyForecast(),
            weatherDetailsState = WeatherDetailsState(
                airQuality = AirQualityEnum.YELLOW,
                feelsLikeState = FeelsLikeState(75.0, 65.0),
                humidityState = HumidityState(90.0, 17.0),
                pressureState = BarometricPressureState(pressure = 0.2F),
                rainFallState = RainFallState("1.8 mm", "1.2 mm"),
                sunriseSunsetState = SunriseSunsetState(
                    localTime = "13:00",
                    sunriseTime = "4:58",
                    sunsetTime = "17:35"
                ),
                uvIndexState = UVIndexEnum.MODERATE,
                visibilityState = VisibilityState("8 km", true),
                windState = WindState(windDirection = WindDirection.N, windSpeed = "9.7"),
            ),
        )
    }

}
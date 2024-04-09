package com.sheltek.kmpweather.compose.previews.utils

import androidx.compose.runtime.mutableStateOf
import com.br.kmpdemo.models.PermissionsDialogState
import com.br.kmpdemo.utils.MeasurementType
import com.sheltek.kmpweather.compose.ui.forecasts.ForecastState
import com.sheltek.kmpweather.compose.ui.forecasts.WeatherEnum
import com.sheltek.kmpweather.compose.ui.home.HomeState
import com.sheltek.kmpweather.compose.ui.weatherDetails.airQuality.AirQualityEnum
import com.sheltek.kmpweather.compose.ui.weatherDetails.feelsLike.FeelsLikeState
import com.sheltek.kmpweather.compose.ui.weatherDetails.humidity.HumidityState
import com.sheltek.kmpweather.compose.ui.weatherDetails.pressure.BarometricPressureState
import com.sheltek.kmpweather.compose.ui.weatherDetails.rainFall.RainFallState
import com.sheltek.kmpweather.compose.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.sheltek.kmpweather.compose.ui.weatherDetails.uvIndex.UVIndexEnum
import com.sheltek.kmpweather.compose.ui.weatherDetails.visibility.VisibilityState
import com.sheltek.kmpweather.compose.ui.weatherDetails.wind.WindDirectionEnum
import com.sheltek.kmpweather.compose.ui.weatherDetails.wind.WindState
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

    fun getMockPrecipProbability(): Int {
        return Random.nextInt(from = 0, until = 99)
    }

    fun getMockTemp(): Int {
        return Random.nextInt(from = 0, until = 115)
    }

    fun getMockRandomIcon(): WeatherEnum {
        return WeatherEnum.values().random()
    }

    fun getMockHomeState(isError: Boolean = false): HomeState {
        if (isError) return HomeState(
            hourlyForecasts = mutableStateOf(getMockHourlyForecast()),
            dailyForecasts = mutableStateOf(getMockWeeklyForecast()),
            realTimeWeather = mutableStateOf(null),
            airQuality = mutableStateOf(AirQualityEnum.UNKNOWN),
            temperature = mutableStateOf(76),
            temperatureHi = mutableStateOf(80),
            temperatureLow = mutableStateOf(68),
            feelsLikeState = mutableStateOf(FeelsLikeState(null, 65.0)),
            humidityState = mutableStateOf(HumidityState(null, null)),
            pressureState = mutableStateOf(BarometricPressureState(pressure = 0.0F)),
            rainFallState = mutableStateOf(RainFallState()),
            sunriseSunsetState = mutableStateOf(
                SunriseSunsetState(
                    localTime = null,
                    sunriseTime = null,
                    sunsetTime = null
                )
            ),
            uvIndexState = mutableStateOf(UVIndexEnum.UNKNOWN),
            visibilityState = mutableStateOf(VisibilityState()),
            windState = mutableStateOf(
                WindState(windDirection = WindDirectionEnum.N)
            ),
            measurementPref = mutableStateOf(MeasurementType.IMPERIAL),
            locationPermissionsDialog = PermissionsDialogState("", {})
        )

        return HomeState(
            hourlyForecasts = mutableStateOf(getMockHourlyForecast()),
            dailyForecasts = mutableStateOf(getMockWeeklyForecast()),
            realTimeWeather = mutableStateOf(null),
            airQuality = mutableStateOf(AirQualityEnum.YELLOW),
            temperature = mutableStateOf(76),
            temperatureHi = mutableStateOf(80),
            temperatureLow = mutableStateOf(68),
            weatherDescription = mutableStateOf(WeatherEnum.SUNNY),
            feelsLikeState = mutableStateOf(FeelsLikeState(null, 65.0)),
            humidityState = mutableStateOf(HumidityState(90.0, 17.0)),
            pressureState = mutableStateOf(BarometricPressureState(pressure = 0.2F)),
            rainFallState = mutableStateOf(RainFallState(1.8, 1.2)),
            sunriseSunsetState = mutableStateOf(
                SunriseSunsetState(
                    localTime = "13:00",
                    sunriseTime = "4:58",
                    sunsetTime = "17:35"
                )
            ),
            uvIndexState = mutableStateOf(UVIndexEnum.MODERATE),
            visibilityState = mutableStateOf(VisibilityState("8 km")),
            windState = mutableStateOf(
                WindState(
                    windDirection = WindDirectionEnum.N,
                    windSpeed = "9.7"
                )
            ),
            measurementPref = mutableStateOf(MeasurementType.IMPERIAL),
            locationPermissionsDialog = PermissionsDialogState("", {})
        )
    }

}
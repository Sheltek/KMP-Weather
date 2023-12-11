package com.br.kmmdemo.previews.utils

import com.br.kmmdemo.ui.forecasts.ForecastState
import com.br.kmmdemo.ui.forecasts.WeatherEnum
import kotlin.random.Random

object MockData {
    private const val NOW_LABEL = "Now"

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
        val hourLabels = hours.apply {
            val nowIndex = Random.nextInt(from = 0, until = lastIndex)
            this[nowIndex] = NOW_LABEL
        }

        return hourLabels.map {
            ForecastState(
                dayTime = it,
                precipProbability = getMockPrecipProbability(),
                temperature = getMockTemp(),
                weatherIcon = getMockRandomIcon(),
                isNow = it.equals(NOW_LABEL, true)
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

}
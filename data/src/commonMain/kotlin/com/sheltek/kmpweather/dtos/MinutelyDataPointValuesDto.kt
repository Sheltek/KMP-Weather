package com.sheltek.kmpweather.network.dtos

import com.sheltek.kmpweather.dtos.Dto
import kotlinx.serialization.Serializable

@Serializable
data class MinutelyDataPointValuesDto(
    val cloudBase: Double? = null,
    val cloudCeiling: Double? = null,
    val cloudCover: Double? = null,
    val dewPoint: Double? = null,
    val freezingRainIntensity: Double? = null,
    val humidity: Double? = null,
    val precipitationProbability: Double? = null,
    val pressureSurfaceLevel: Double? = null,
    val rainIntensity: Double? = null,
    val sleetIntensity: Double? = null,
    val snowIntensity: Double? = null,
    val temperature: Double? = null,
    val temperatureApparent: Double? = null,
    val uvHealthConcern: Double? = null,
    val uvIndex: Double? = null,
    val visibility: Double? = null,
    val weatherCode: Double? = null,
    val windDirection: Double? = null,
    val windGust: Double? = null,
    val windSpeed: Double? = null
): Dto

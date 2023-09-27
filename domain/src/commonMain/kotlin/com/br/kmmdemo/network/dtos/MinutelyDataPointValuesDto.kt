package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class MinutelyDataPointValuesDto(
    val cloudBase: Float?,
    val cloudCeiling: Float?,
    val cloudCover: Int?,
    val dewPoint: Float?,
    val freezingRainIntensity: Int?,
    val humidity: Int?,
    val precipitationProbability: Int?,
    val pressureSurfaceLevel: Float?,
    val rainIntensity: Int?,
    val sleetIntensity: Int?,
    val snowIntensity: Int?,
    val temperature: Float?,
    val temperatureApparent: Float?,
    val uvHealthConcern: Int?,
    val uvIndex: Int?,
    val visibility: Int?,
    val weatherCode: Int?,
    val windDirection: Float?,
    val windGust: Float?,
    val windSpeed: Float?
)

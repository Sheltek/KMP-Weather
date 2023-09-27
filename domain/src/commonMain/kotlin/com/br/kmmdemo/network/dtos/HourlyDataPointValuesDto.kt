package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class HourlyDataPointValuesDto(
    val cloudBase: Float?,
    val cloudCeiling: String?,
    val cloudCover: Int?,
    val dewPoint: Float?,
    val evapotranspiration: Float?,
    val freezingRainIntensity: Int?,
    val humidity: Int?,
    val iceAccumulation: Int?,
    val iceAccumulationLwe: Int?,
    val precipitationProbability: Int?,
    val pressureSurfaceLevel: Float?,
    val rainAccumulation: Int?,
    val rainAccumulationLwe: Int?,
    val rainIntensity: Int?,
    val sleetAccumulation: Int?,
    val sleetAccumulationLwe: Int?,
    val sleetIntensity: Int?,
    val snowAccumulation: Int?,
    val snowAccumulationLwe: Int?,
    val snowIntensity: Int?,
    val temperature: Float?,
    val temperatureApparent: Float?,
    val uvHealthConcern: Int?,
    val uvIndex: Int?,
    val visibility: Int?,
    val weatherCode: Int?,
    val windDirection: Float?,
    val windGust: Int?,
    val windSpeed: Int?
)

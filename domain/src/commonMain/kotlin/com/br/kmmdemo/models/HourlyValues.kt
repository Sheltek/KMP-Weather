package com.br.kmmdemo.models

import com.br.kmmdemo.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class HourlyValues(
    val cloudBase: Double?,
    val cloudCeiling: Double?,
    val cloudCover: Double?,
    val dewPoint: Double?,
    val evapotranspiration: Double?,
    val freezingRainIntensity: Int?,
    val humidity: Double?,
    val iceAccumulation: Int?,
    val iceAccumulationLwe: Int?,
    val precipitationProbability: Int?,
    val pressureSurfaceLevel: Double?,
    val rainAccumulation: Double?,
    val rainAccumulationLwe: Double?,
    val rainIntensity: Double?,
    val sleetAccumulation: Int?,
    val sleetAccumulationLwe: Int?,
    val sleetIntensity: Int?,
    val snowAccumulation: Int?,
    val snowAccumulationLwe: Int?,
    val snowDepth: Int?,
    val snowIntensity: Int?,
    val temperature: Double?,
    val temperatureApparent: Double?,
    val uvHealthConcern: Int?,
    val uvIndex: Int?,
    val visibility: Double?,
    val weatherCode: Int?,
    val windDirection: Double?,
    val windGust: Double?,
    val windSpeed: Double?
): DomainModel

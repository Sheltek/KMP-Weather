package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.HourlyDataPointValuesDto

fun HourlyDataPointValuesDto?.toHourlyValuesModel() = com.sheltek.kmpweather.models.HourlyValues(
    cloudBase = this?.cloudBase,
    cloudCeiling = this?.cloudCeiling,
    cloudCover = this?.cloudCover,
    dewPoint = this?.dewPoint,
    evapotranspiration = this?.evapotranspiration,
    freezingRainIntensity = this?.freezingRainIntensity,
    humidity = this?.humidity,
    iceAccumulation = this?.iceAccumulation,
    iceAccumulationLwe = this?.iceAccumulationLwe,
    precipitationProbability = this?.precipitationProbability,
    pressureSurfaceLevel = this?.pressureSurfaceLevel,
    rainAccumulation = this?.rainAccumulation,
    rainAccumulationLwe = this?.rainAccumulationLwe,
    rainIntensity = this?.rainIntensity,
    sleetAccumulation = this?.sleetAccumulation,
    sleetAccumulationLwe = this?.sleetAccumulationLwe,
    sleetIntensity = this?.sleetIntensity,
    snowAccumulation = this?.snowAccumulation,
    snowAccumulationLwe = this?.snowAccumulationLwe,
    snowDepth = this?.snowDepth,
    snowIntensity = this?.snowIntensity,
    temperature = this?.temperature,
    temperatureApparent = this?.temperatureApparent,
    uvHealthConcern = this?.uvHealthConcern,
    uvIndex = this?.uvIndex,
    visibility = this?.visibility,
    weatherCode = this?.weatherCode,
    windDirection = this?.windDirection,
    windGust = this?.windGust,
    windSpeed = this?.windSpeed
)
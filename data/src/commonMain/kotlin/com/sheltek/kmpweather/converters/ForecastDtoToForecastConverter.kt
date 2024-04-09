package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.ForecastDto

fun ForecastDto?.toForecastModel() = com.sheltek.kmpweather.models.Forecast(
    timelines = this?.timelines.toTimelinesModel(),
    locationDto = this?.locationDto.toLocationModel()
)

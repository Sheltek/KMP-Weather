package com.br.kmmdemo.converters

import com.br.kmmdemo.models.Forecast
import com.br.kmmdemo.dtos.ForecastDto

fun ForecastDto?.toForecastModel(): Forecast {
    return Forecast(
        timelines = this?.timelines.toTimelinesModel(),
        locationDto = this?.locationDto.toLocationModel()
    )
}
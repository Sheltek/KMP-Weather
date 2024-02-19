package com.br.kmmdemo.converters

import com.br.kmmdemo.models.Forecast
import com.br.kmmdemo.network.dtos.ForecastDto

fun ForecastDto?.toForecastModel(): Forecast {
    return Forecast(
        timelines = this?.timelines.toTimelinesModel(),
        locationDto = this?.locationDto.toLocationModel()
    )
}
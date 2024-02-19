package com.br.kmmdemo.converters

import com.br.kmmdemo.models.Hourly
import com.br.kmmdemo.network.dtos.HourlyDto

fun HourlyDto?.toHourlyModel(): Hourly {
    return Hourly(
        time = this?.time,
        hourlyValues = this?.hourlyValues?.toHourlyValuesModel()
    )
}
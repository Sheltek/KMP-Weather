package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.HourlyDto

fun HourlyDto?.toHourlyModel() = com.sheltek.kmpweather.models.Hourly(
    time = this?.time,
    hourlyValues = this?.hourlyValues?.toHourlyValuesModel()
)
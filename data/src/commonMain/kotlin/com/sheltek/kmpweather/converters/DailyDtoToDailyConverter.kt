package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.DailyDto

fun DailyDto?.toDailyModel() = com.sheltek.kmpweather.models.Daily(
    time = this?.time,
    dailyValues = this?.dailyValues?.toDailyValuesModel()
)
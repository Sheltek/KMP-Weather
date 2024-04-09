package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.MinutelyDto

fun MinutelyDto?.toMinutelyModel() = com.sheltek.kmpweather.models.Minutely(
    time = this?.time,
    minutelyValues = this?.minutelyValues?.toMinutelyValuesModel()
)
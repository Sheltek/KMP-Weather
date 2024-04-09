package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.RealTimeDataDto

fun RealTimeDataDto?.toRealTimeDataModel() = com.sheltek.kmpweather.models.RealTimeData(
    time = this?.time,
    realTimeValues = this?.realTimeValues.toRealTimeValuesModel(),
)
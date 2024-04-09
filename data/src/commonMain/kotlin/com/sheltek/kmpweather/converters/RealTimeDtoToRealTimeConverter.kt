package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.RealTimeDto

fun RealTimeDto?.toRealTimeModel() = com.sheltek.kmpweather.models.RealTime(
    data = this?.data?.toRealTimeDataModel(),
    location = this?.location?.toLocationModel()
)
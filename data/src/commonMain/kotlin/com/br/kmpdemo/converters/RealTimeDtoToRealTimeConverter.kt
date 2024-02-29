package com.br.kmpdemo.converters

import com.br.kmpdemo.dtos.RealTimeDto
import com.br.kmpdemo.models.RealTime

fun RealTimeDto?.toRealTimeModel(): RealTime {
    return RealTime(
        data = this?.data?.toRealTimeDataModel(),
        location = this?.location?.toLocationModel()
    )
}
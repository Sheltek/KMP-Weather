package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.LocationDto

fun LocationDto?.toLocationModel() = com.sheltek.kmpweather.models.Location(
    lat = this?.lat,
    lon = this?.lon,
    name = this?.name,
    type = this?.type
)
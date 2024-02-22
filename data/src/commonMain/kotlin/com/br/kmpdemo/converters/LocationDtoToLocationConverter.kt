package com.br.kmpdemo.converters

import com.br.kmpdemo.models.Location
import com.br.kmpdemo.dtos.LocationDto

fun LocationDto?.toLocationModel(): Location {
    return Location(
        lat = this?.lat,
        lon = this?.lon,
        name = this?.name,
        type = this?.type
    )
}
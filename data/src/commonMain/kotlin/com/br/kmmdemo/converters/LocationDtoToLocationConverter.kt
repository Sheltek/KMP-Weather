package com.br.kmmdemo.converters

import com.br.kmmdemo.models.Location
import com.br.kmmdemo.network.dtos.LocationDto

fun LocationDto?.toLocationModel(): Location {
    return Location(
        lat = this?.lat,
        lon = this?.lon,
        name = this?.name,
        type = this?.type
    )
}
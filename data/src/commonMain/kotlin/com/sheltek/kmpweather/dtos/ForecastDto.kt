package com.sheltek.kmpweather.dtos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastDto(
    val timelines: com.sheltek.kmpweather.dtos.TimelinesDto? = null,
    @SerialName("location") val locationDto: com.sheltek.kmpweather.dtos.LocationDto? = null
): Dto

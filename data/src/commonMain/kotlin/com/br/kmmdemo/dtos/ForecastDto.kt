package com.br.kmmdemo.dtos

import com.br.kmmdemo.network.dtos.Dto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastDto(
    val timelines: TimelinesDto? = null,
    @SerialName("location") val locationDto: LocationDto? = null
): Dto

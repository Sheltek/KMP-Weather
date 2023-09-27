package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class ForecastDto(
    val timelines: TimelinesDto?,
    val locationDto: LocationDto?
)

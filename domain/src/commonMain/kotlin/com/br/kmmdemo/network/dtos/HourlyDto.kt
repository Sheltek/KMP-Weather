package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class HourlyDto(
    val time: String?,
    val values: List<HourlyDataPointValuesDto?>?
)

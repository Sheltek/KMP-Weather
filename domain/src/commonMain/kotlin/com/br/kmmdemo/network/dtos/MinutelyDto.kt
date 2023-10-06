package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class MinutelyDto(
    val time: String?,
    val minutelyValues: List<MinutelyDataPointValuesDto?>?,
)

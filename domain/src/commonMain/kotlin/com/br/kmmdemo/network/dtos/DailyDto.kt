package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class DailyDto(
    val time: String?,
    val dailyValues: List<DailyDataPointValuesDto?>?
)

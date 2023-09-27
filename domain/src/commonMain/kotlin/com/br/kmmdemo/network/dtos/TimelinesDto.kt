package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class TimelinesDto(
    val hourly: List<HourlyDto?>?,
    val minutely: List<MinutelyDto?>?,
    val daily: List<DailyDto?>?
)

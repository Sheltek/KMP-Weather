package com.sheltek.kmpweather.dtos

import kotlinx.serialization.Serializable

@Serializable
data class TimelinesDto(
    val hourly: List<com.sheltek.kmpweather.dtos.HourlyDto?>? = null,
    val minutely: List<com.sheltek.kmpweather.dtos.MinutelyDto?>? = null,
    val daily: List<com.sheltek.kmpweather.dtos.DailyDto?>? = null
): Dto

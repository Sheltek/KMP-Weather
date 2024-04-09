package com.sheltek.kmpweather.dtos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DailyDto(
    val time: String?,
    @SerialName("values") val dailyValues: com.sheltek.kmpweather.dtos.DailyDataPointValuesDto?
): Dto

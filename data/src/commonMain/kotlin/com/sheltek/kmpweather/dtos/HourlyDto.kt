package com.sheltek.kmpweather.dtos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyDto(
    val time: String?,
    @SerialName("values") val hourlyValues: com.sheltek.kmpweather.dtos.HourlyDataPointValuesDto?
): Dto

package com.sheltek.kmpweather.dtos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RealTimeDataDto(
    val time: String?,
    @SerialName("values") val realTimeValues: com.sheltek.kmpweather.dtos.RealTimeValuesDto?
): Dto

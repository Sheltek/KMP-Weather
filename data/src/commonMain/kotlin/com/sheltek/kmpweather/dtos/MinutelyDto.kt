package com.sheltek.kmpweather.dtos

import com.sheltek.kmpweather.network.dtos.MinutelyDataPointValuesDto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MinutelyDto(
    val time: String?,
    @SerialName("values") val minutelyValues: MinutelyDataPointValuesDto?,
): Dto

package com.br.kmmdemo.dtos

import com.br.kmmdemo.network.dtos.Dto
import com.br.kmmdemo.network.dtos.MinutelyDataPointValuesDto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MinutelyDto(
    val time: String?,
    @SerialName("values") val minutelyValues: MinutelyDataPointValuesDto?,
): Dto

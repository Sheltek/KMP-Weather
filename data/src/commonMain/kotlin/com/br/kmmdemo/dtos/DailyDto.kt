package com.br.kmmdemo.dtos

import com.br.kmmdemo.network.dtos.DailyDataPointValuesDto
import com.br.kmmdemo.network.dtos.Dto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DailyDto(
    val time: String?,
    @SerialName("values") val dailyValues: DailyDataPointValuesDto?
): Dto

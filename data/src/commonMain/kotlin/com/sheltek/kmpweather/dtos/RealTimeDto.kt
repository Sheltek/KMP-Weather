package com.sheltek.kmpweather.dtos

import kotlinx.serialization.Serializable

@Serializable
data class RealTimeDto(
    val data: com.sheltek.kmpweather.dtos.RealTimeDataDto?,
    val location: com.sheltek.kmpweather.dtos.LocationDto?,
): Dto

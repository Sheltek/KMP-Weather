package com.br.kmmdemo.network.dtos

import kotlinx.serialization.Serializable

@Serializable
data class LocationDto(
    val lat: Double?,
    val lon: Double?,
    val name: String?,
    val type: String?
)
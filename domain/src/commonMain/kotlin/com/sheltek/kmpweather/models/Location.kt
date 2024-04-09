package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val lat: Double?,
    val lon: Double?,
    val name: String?,
    val type: String?
): com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
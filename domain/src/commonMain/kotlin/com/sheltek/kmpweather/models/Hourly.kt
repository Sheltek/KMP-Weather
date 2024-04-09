package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Hourly(
    val time: String?,
    val hourlyValues: com.sheltek.kmpweather.models.HourlyValues?
) : com.sheltek.kmpweather.models.domainmodelinterface.DomainModel

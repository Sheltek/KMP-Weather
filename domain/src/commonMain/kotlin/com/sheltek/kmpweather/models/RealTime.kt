package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class RealTime(
    val data: com.sheltek.kmpweather.models.RealTimeData?,
    val location: com.sheltek.kmpweather.models.Location?
) : com.sheltek.kmpweather.models.domainmodelinterface.DomainModel

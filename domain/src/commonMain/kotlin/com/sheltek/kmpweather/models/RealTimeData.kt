package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class RealTimeData(
    val time: String?,
    val realTimeValues: com.sheltek.kmpweather.models.RealTimeValues?
): com.sheltek.kmpweather.models.domainmodelinterface.DomainModel

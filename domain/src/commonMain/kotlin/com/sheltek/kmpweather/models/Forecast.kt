package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Forecast(
    val timelines: com.sheltek.kmpweather.models.Timelines?,
    val locationDto: com.sheltek.kmpweather.models.Location?
): com.sheltek.kmpweather.models.domainmodelinterface.DomainModel

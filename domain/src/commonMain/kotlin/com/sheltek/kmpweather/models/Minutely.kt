package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Minutely(
    val time: String?,
    val minutelyValues: com.sheltek.kmpweather.models.MinutelyValues?,
): com.sheltek.kmpweather.models.domainmodelinterface.DomainModel

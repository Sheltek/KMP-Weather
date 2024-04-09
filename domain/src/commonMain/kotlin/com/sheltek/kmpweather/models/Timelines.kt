package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Timelines(
    val hourly: List<com.sheltek.kmpweather.models.Hourly?>?,
    val minutely: List<com.sheltek.kmpweather.models.Minutely?>?,
    val daily: List<com.sheltek.kmpweather.models.Daily?>?
): com.sheltek.kmpweather.models.domainmodelinterface.DomainModel

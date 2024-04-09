package com.sheltek.kmpweather.models

import com.sheltek.kmpweather.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Daily(
    val time: String?,
    val dailyValues: com.sheltek.kmpweather.models.DailyValues?
): com.sheltek.kmpweather.models.domainmodelinterface.DomainModel

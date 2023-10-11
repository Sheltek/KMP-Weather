package com.br.kmmdemo.models

import com.br.kmmdemo.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Daily(
    val time: String?,
    val dailyValues: DailyValues?
): DomainModel

package com.br.kmmdemo.models

import com.br.kmmdemo.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Hourly(
    val time: String?,
    val hourlyValues: HourlyValues?
) : DomainModel

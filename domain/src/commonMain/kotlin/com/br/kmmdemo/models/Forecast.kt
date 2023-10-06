package com.br.kmmdemo.models

import com.br.kmmdemo.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Forecast(
    val timelines: Timelines?,
    val locationDto: Location?
): DomainModel

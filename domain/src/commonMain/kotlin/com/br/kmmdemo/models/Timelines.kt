package com.br.kmmdemo.models

import com.br.kmmdemo.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Timelines(
    val hourly: List<Hourly?>?,
    val minutely: List<Minutely?>?,
    val daily: List<Daily?>?
): DomainModel

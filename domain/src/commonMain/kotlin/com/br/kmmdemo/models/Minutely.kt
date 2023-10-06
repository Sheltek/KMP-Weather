package com.br.kmmdemo.models

import com.br.kmmdemo.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Minutely(
    val time: String?,
    val minutelyValues: List<MinutelyValues?>?,
): DomainModel

package com.br.kmmdemo.models

import com.br.kmmdemo.models.domainmodelinterface.DomainModel
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val lat: Double?,
    val lon: Double?,
    val name: String?,
    val type: String?
): DomainModel
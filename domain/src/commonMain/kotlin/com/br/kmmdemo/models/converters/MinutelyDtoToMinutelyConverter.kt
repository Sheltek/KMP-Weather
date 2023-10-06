package com.br.kmmdemo.models.converters

import com.br.kmmdemo.models.Minutely
import com.br.kmmdemo.network.dtos.MinutelyDto

fun MinutelyDto?.toMinutelyModel(): Minutely {
    return Minutely(
        time = this?.time,
        minutelyValues = this?.minutelyValues?.map { it.toMinutelyValuesModel() }
    )
}
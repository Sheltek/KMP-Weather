package com.br.kmmdemo.converters

import com.br.kmmdemo.models.Minutely
import com.br.kmmdemo.dtos.MinutelyDto

fun MinutelyDto?.toMinutelyModel(): Minutely {
    return Minutely(
        time = this?.time,
        minutelyValues = this?.minutelyValues?.toMinutelyValuesModel()
    )
}
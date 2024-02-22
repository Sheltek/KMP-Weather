package com.br.kmpdemo.converters

import com.br.kmpdemo.models.Minutely
import com.br.kmpdemo.dtos.MinutelyDto

fun MinutelyDto?.toMinutelyModel(): Minutely {
    return Minutely(
        time = this?.time,
        minutelyValues = this?.minutelyValues?.toMinutelyValuesModel()
    )
}
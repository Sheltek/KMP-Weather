package com.br.kmpdemo.converters

import com.br.kmpdemo.models.Daily
import com.br.kmpdemo.dtos.DailyDto

fun DailyDto?.toDailyModel(): Daily {
    return Daily(
        time = this?.time,
        dailyValues = this?.dailyValues?.toDailyValuesModel()
    )
}
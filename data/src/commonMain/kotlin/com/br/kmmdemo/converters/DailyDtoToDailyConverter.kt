package com.br.kmmdemo.converters

import com.br.kmmdemo.models.Daily
import com.br.kmmdemo.network.dtos.DailyDto

fun DailyDto?.toDailyModel(): Daily {
    return Daily(
        time = this?.time,
        dailyValues = this?.dailyValues?.toDailyValuesModel()
    )
}
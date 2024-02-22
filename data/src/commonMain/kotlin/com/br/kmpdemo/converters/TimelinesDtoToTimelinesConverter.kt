package com.br.kmpdemo.converters

import com.br.kmpdemo.models.Timelines
import com.br.kmpdemo.dtos.TimelinesDto

fun TimelinesDto?.toTimelinesModel(): Timelines {
    return Timelines(
        hourly = this?.hourly?.map { it.toHourlyModel() },
        minutely = this?.minutely?.map { it.toMinutelyModel() },
        daily = this?.daily?.map { it.toDailyModel() }
    )
}
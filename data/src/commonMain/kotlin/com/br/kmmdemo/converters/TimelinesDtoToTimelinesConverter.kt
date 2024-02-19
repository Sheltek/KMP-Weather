package com.br.kmmdemo.converters

import com.br.kmmdemo.models.Timelines
import com.br.kmmdemo.network.dtos.TimelinesDto

fun TimelinesDto?.toTimelinesModel(): Timelines {
    return Timelines(
        hourly = this?.hourly?.map { it.toHourlyModel() },
        minutely = this?.minutely?.map { it.toMinutelyModel() },
        daily = this?.daily?.map { it.toDailyModel() }
    )
}
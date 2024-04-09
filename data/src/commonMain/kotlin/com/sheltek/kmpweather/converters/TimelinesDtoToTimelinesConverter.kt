package com.sheltek.kmpweather.converters

import com.sheltek.kmpweather.dtos.TimelinesDto

fun TimelinesDto?.toTimelinesModel() = com.sheltek.kmpweather.models.Timelines(
    hourly = this?.hourly?.map { it.toHourlyModel() },
    minutely = this?.minutely?.map { it.toMinutelyModel() },
    daily = this?.daily?.map { it.toDailyModel() }
)
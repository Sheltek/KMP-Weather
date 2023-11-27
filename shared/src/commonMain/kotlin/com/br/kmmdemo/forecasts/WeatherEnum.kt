package com.br.kmmdemo.forecasts

import com.br.kmmdemo.resources.SharedRes
import dev.icerock.moko.resources.ImageResource

enum class WeatherEnum(val icon: ImageResource) {
    DAY_FOG(SharedRes.images.day_fog),
    DAY_RAIN(SharedRes.images.day_rain),
    DAY_SNOW(SharedRes.images.day_snow),
    DAY_THUNDERSTORM(SharedRes.images.day_thunderstorm),
    HAIL(SharedRes.images.hail),
    LIGHTENING(SharedRes.images.lightening),
    NIGHT_CLEAR(SharedRes.images.night_clear),
    NIGHT_CLOUDY(SharedRes.images.night_cloudy),
    NIGHT_FOG(SharedRes.images.night_fog),
    NIGHT_RAIN(SharedRes.images.night_rain),
    NIGHT_SNOW(SharedRes.images.night_snow),
    NIGHT_THUNDERSTORM(SharedRes.images.night_thunderstorm),
    OVERCAST_CLOUDY(SharedRes.images.overcast_cloudy),
    DAY_PARTLY_CLOUDY(SharedRes.images.partly_cloudy),
    HEAVY_RAIN(SharedRes.images.rain_heavy),
    LIGHT_RAIN(SharedRes.images.rain_light),
    SUNNY(SharedRes.images.sunny),
    WINDY(SharedRes.images.windy),
}
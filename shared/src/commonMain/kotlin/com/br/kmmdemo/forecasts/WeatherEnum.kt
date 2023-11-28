package com.br.kmmdemo.forecasts

import com.br.kmmdemo.resources.SharedRes
import dev.icerock.moko.resources.ImageResource

enum class WeatherEnum(val weather: String, val icon: ImageResource) {
    DAY_FOG("Fog", SharedRes.images.day_fog),
    DAY_RAIN("Rain", SharedRes.images.day_rain),
    DAY_SNOW("Snow", SharedRes.images.day_snow),
    DAY_THUNDERSTORM("Thunderstorms", SharedRes.images.day_thunderstorm),
    HAIL("Hail", SharedRes.images.hail),
    LIGHTENING("Lightening", SharedRes.images.lightening),
    NIGHT_CLEAR("Clear Skies", SharedRes.images.night_clear),
    NIGHT_CLOUDY("Partly Cloudy", SharedRes.images.night_cloudy),
    NIGHT_FOG("Fog", SharedRes.images.night_fog),
    NIGHT_RAIN("Rain", SharedRes.images.night_rain),
    NIGHT_SNOW("Snow", SharedRes.images.night_snow),
    NIGHT_THUNDERSTORM("Thunderstorms", SharedRes.images.night_thunderstorm),
    OVERCAST_CLOUDY("Cloudy", SharedRes.images.overcast_cloudy),
    DAY_PARTLY_CLOUDY("Partly Cloudy", SharedRes.images.partly_cloudy),
    HEAVY_RAIN("Heavy Rain", SharedRes.images.rain_heavy),
    LIGHT_RAIN("Light Rain", SharedRes.images.rain_light),
    SUNNY("Sunny", SharedRes.images.sunny),
    WINDY("Windy", SharedRes.images.windy),
}
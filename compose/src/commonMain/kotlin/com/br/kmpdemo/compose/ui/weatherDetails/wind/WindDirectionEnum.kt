package com.br.kmpdemo.compose.ui.weatherDetails.wind

/**
 * "degrees" slightly adjusted from normal to better match up with
 * Cardinal and Intermediate Lines.
 */
enum class WindDirectionEnum(val direction: String, val degrees: Double) {
    N("North", 0.0),
    NNE("North-Northeast", 29.5),
    NE("Northeast", 45.0),
    ENE("East-Northeast", 60.5),
    E("East", 90.0),
    ESE("East-Southeast", 119.5),
    SE("Southeast", 135.0),
    SSE("South-Southeast", 150.5),
    S("South", 180.0),
    SSW("South-Southwest", 209.5),
    SW("Southwest", 226.0),
    WSW("West-Southwest", 240.5),
    W("West", 270.0),
    WNW("West-Northwest", 299.5),
    NW("Northwest", 316.0),
    NNW("North-Northwest", 330.5),
    UNKNOWN("", 0.0)
}

fun Double?.getWindDirection(): WindDirectionEnum {
    return when (this ?: -1.0) {
        0.0 -> WindDirectionEnum.N
        in 0.1..30.0 -> WindDirectionEnum.NNE
        in 30.0..45.0 -> WindDirectionEnum.NE
        in 45.0..60.5 -> WindDirectionEnum.ENE
        in 60.5..90.0 -> WindDirectionEnum.E
        in 90.0..119.5 -> WindDirectionEnum.ESE
        in 119.5..135.0 -> WindDirectionEnum.SE
        in 135.0..150.5 -> WindDirectionEnum.SSE
        in 150.5..180.0 -> WindDirectionEnum.S
        in 180.0..209.5 -> WindDirectionEnum.SSW
        in 209.5..226.0 -> WindDirectionEnum.SW
        in 226.0..240.5 -> WindDirectionEnum.WSW
        in 240.5..270.0 -> WindDirectionEnum.W
        in 270.0..299.5 -> WindDirectionEnum.WNW
        in 299.5..316.0 -> WindDirectionEnum.NW
        in 316.0..330.5 -> WindDirectionEnum.NNW
        else -> WindDirectionEnum.UNKNOWN
    }
}
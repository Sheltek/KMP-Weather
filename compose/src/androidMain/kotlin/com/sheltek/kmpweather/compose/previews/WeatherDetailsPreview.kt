package com.sheltek.kmpweather.compose.previews

import BarometricPressureWidget
import FeelsLikeWidget
import VisibilityWidget
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.previews.utils.MockData
import com.sheltek.kmpweather.compose.resources.theme.KmpWeatherTheme
import com.sheltek.kmpweather.compose.ui.weatherDetails.airQuality.AirQualityEnum
import com.sheltek.kmpweather.compose.ui.weatherDetails.airQuality.AirQualityWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.feelsLike.FeelsLikeState
import com.sheltek.kmpweather.compose.ui.weatherDetails.humidity.HumidityState
import com.sheltek.kmpweather.compose.ui.weatherDetails.humidity.HumidityWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.pressure.BarometricPressureState
import com.sheltek.kmpweather.compose.ui.weatherDetails.rainFall.RainFallWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.sheltek.kmpweather.compose.ui.weatherDetails.sunrise_sunset.SunriseSunsetWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.uvIndex.UVIndexEnum
import com.sheltek.kmpweather.compose.ui.weatherDetails.uvIndex.UvIndexWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.wind.WindWidget

@Composable
@Preview
fun AirQualityPreview() {
    KmpWeatherTheme {
        Column {
            AirQualityWidget(AirQualityEnum.YELLOW)
            // No Air Quality Info Returned
            AirQualityWidget(AirQualityEnum.UNKNOWN)
        }
    }
}

@Composable
@Preview
fun UVIndexPreview() {
    KmpWeatherTheme {
        Row {
            UvIndexWidget(UVIndexEnum.MODERATE)
            UvIndexWidget(UVIndexEnum.UNKNOWN)
        }
    }
}

@Composable
@Preview
fun FeelsLikePreview() {
    KmpWeatherTheme {
        Row {
            FeelsLikeWidget(FeelsLikeState(75.0, 65.0))
            FeelsLikeWidget(FeelsLikeState(null, 59.0))
        }
    }
}

@Composable
@Preview
fun HumidityPreview() {
    KmpWeatherTheme {
        Row {
            HumidityWidget(HumidityState(90.0, 17.0))
            HumidityWidget(HumidityState(null, null))
        }
    }
}

@Composable
@Preview
fun RainFallPreview() {
    KmpWeatherTheme {
        Row {
            RainFallWidget(MockData.getMockHomeState())
            RainFallWidget(MockData.getMockHomeState(isError = true))
        }
    }
}

@Composable
@Preview
fun VisibilityPreview() {
    KmpWeatherTheme {
        Row {
            VisibilityWidget(MockData.getMockHomeState())
            VisibilityWidget(MockData.getMockHomeState(isError = true))
        }
    }
}

@Composable
@Preview
fun SunriseSunsetPreview() {
    KmpWeatherTheme {
        Column {
            Row {
                SunriseSunsetWidget(SunriseSunsetState(localTime = "13:00", sunriseTime = "4:58", sunsetTime = "17:35"))
                SunriseSunsetWidget(SunriseSunsetState(localTime = "14:20", sunriseTime = "5:25", sunsetTime = "18:02"))
            }
            Row {
                SunriseSunsetWidget(SunriseSunsetState(localTime = "14:45", sunriseTime = "6:14", sunsetTime = "18:15"))
                SunriseSunsetWidget(SunriseSunsetState(localTime = "20:23", sunriseTime = "7:23", sunsetTime = "19:04"))
            }
            Row {
                SunriseSunsetWidget(SunriseSunsetState(localTime = null, sunriseTime = null, sunsetTime = null))
            }
        }

    }
}

@Composable
@Preview
fun BarometricPressurePreview() {
    KmpWeatherTheme {
        Column {
            Row {
                BarometricPressureWidget(state = BarometricPressureState(pressure = 0.2F))
                BarometricPressureWidget(state = BarometricPressureState(pressure = 0.4F))
            }
            Row {
                BarometricPressureWidget(state = BarometricPressureState(pressure = 0.6F))
                BarometricPressureWidget(state = BarometricPressureState(pressure = 0.8F))
            }
            Row {
                BarometricPressureWidget(state = BarometricPressureState(pressure = 1F))
                BarometricPressureWidget(state = BarometricPressureState(pressure = 0.0F))
            }
        }

    }
}

@Composable
@Preview
fun WindPreview() {
    KmpWeatherTheme {
        Column {
            Row {
                WindWidget(MockData.getMockHomeState(isError = true))
                WindWidget(MockData.getMockHomeState())
            }
        }
    }
}
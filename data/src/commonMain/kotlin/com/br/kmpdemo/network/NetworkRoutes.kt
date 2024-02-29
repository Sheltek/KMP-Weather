package com.br.kmpdemo.network

/**
 * Format = https://api.tomorrow.io/v4/weather/forecast?location={LOCATION}&timesteps={TIMESTEP}&units={UNITS}&apikey={API_KEY}
 * - LOCATION format can be:
 *      city name (location=new york)
 *      lat/long pair (location=42.3478, -71.0466)
 *      zip code (location=10029)
 * - For TIMESTEP, use [DAILY_FORECAST], [HOURLY_FORECAST], or [REALTIME_FORECAST]
 *      Must use [DAILY_FORECAST] to access some fields like sunriseTime and sunsetTime
 *      Use [HOURLY_FORECAST] to access hourly forecast data
 *      Use [REALTIME_FORECAST] to access current weather data for WeatherWidget
 * - For UNITS (optional), use [METRIC] or [IMPERIAL]
 **/
object NetworkRoutes {
    private const val BASE_URL = "https://api.tomorrow.io/v4/weather"
    private const val BASE_HOST = "api.tomorrow.io/v4/weather"
    private const val FORECAST_URL = "${BASE_URL}/forecast"
    private const val REALTIME_URL = "${BASE_URL}/realtime"
    const val API_KEY = "64JPsK8f3qpZkvaqAlToKoi0HMIv3ydf"
    private const val DAILY_FORECAST = "1d"
    private const val HOURLY_FORECAST = "1h"
    private const val REALTIME_FORECAST = "current"
    const val METRIC = "metric"
    const val IMPERIAL = "imperial" // TODO: Default to imperial until metric is available

    fun getHourlyForecast(location: String, units: String) =
        "${FORECAST_URL}?location=${location}&timesteps=${HOURLY_FORECAST}&units=${units}&apikey=${API_KEY}"

    fun getDailyForecast(location: String, units: String) =
        "${FORECAST_URL}?location=${location}&timesteps=${DAILY_FORECAST}&units=${units}&apikey=${API_KEY}"

    fun getRealTimeForecast(location: String, units: String) =
        "${REALTIME_URL}?location=${location}&units=${units}&apikey=${API_KEY}"
}
package com.br.kmmdemo.usecases.forecastusecase

import com.br.kmmdemo.models.converters.toForecastModel
import com.br.kmmdemo.repositories.WeatherRepository
import org.koin.core.component.inject
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityUseCase.InvalidCityName
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityUseCase.Request
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityUseCase.Response

class ForecastForCityInteractor: ForecastForCityUseCase {
    private val weatherRepo: WeatherRepository by inject()
    override suspend fun invoke(request: Request?) =
        if (request != null) {
            if (request.city.isBlank()) throw InvalidCityName()
            val result = weatherRepo.getForecastForCity(request.city)
            Result.success(Response(result.getOrNull().toForecastModel()))
        } else {
            throw IllegalArgumentException("Request required")
        }

//        request assertNotNull { forecastRequest ->
//            if (forecastRequest.city.isBlank()) throw InvalidCityName()
//            val result = weatherRepo.getForecastForCity(forecastRequest.city)
//            Result.success(Response(result.getOrNull().toForecastModel()))
//        }
}
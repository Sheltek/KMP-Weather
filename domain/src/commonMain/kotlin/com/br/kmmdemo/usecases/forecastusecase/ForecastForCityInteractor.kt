package com.br.kmmdemo.usecases.forecastusecase

import com.br.kmmdemo.models.converters.toForecastModel
import com.br.kmmdemo.repositories.WeatherRepoImplementation
import org.koin.core.component.inject

class ForecastForCityInteractor: ForecastForCityUseCase {
    private val weatherRepo: WeatherRepoImplementation by inject()
    override suspend fun invoke(request: ForecastForCityUseCase.Request?) =
        request assertNotNull { forecastRequest ->
            if (forecastRequest.city.isBlank()) throw ForecastForCityUseCase.InvalidCityName()
            val result = weatherRepo.getForecastForCity(forecastRequest.city)
            Result.success(ForecastForCityUseCase.Response(result.getOrNull().toForecastModel()))
        }
}
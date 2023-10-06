package com.br.kmmdemo.usecases.forecastusecase

import com.br.kmmdemo.models.Forecast
import com.br.kmmdemo.usecases.BaseUseCase

interface ForecastForCityUseCase :
    BaseUseCase<ForecastForCityUseCase.Request, ForecastForCityUseCase.Response> {
    data class Request(
        val city: String
    ) : BaseUseCase.BaseRequest()

    data class Response(
        val forecast: Forecast?
    ) : BaseUseCase.BaseResponse()

    class InvalidCityName : IllegalArgumentException("City name is invalid")
}
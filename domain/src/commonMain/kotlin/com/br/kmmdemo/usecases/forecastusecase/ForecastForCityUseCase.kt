package com.br.kmmdemo.usecases.forecastusecase

import com.br.kmmdemo.models.Forecast
import com.br.kmmdemo.usecases.BaseUseCase
import com.br.kmmdemo.usecases.BaseUseCase.*
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityUseCase.*

interface ForecastForCityUseCase :
    BaseUseCase<Request, Response> {
    data class Request(
        val city: String
    ) : BaseRequest()

    data class Response(
        val forecast: Forecast?
    ) : BaseResponse()

    class InvalidCityName : IllegalArgumentException("City name is invalid")
}
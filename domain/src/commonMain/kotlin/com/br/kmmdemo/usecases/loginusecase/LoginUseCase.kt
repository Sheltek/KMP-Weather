package com.br.kmmdemo.usecases.loginusecase

import com.br.kmmdemo.usecases.BaseUseCase
import com.br.kmmdemo.usecases.BaseUseCase.*
import com.br.kmmdemo.usecases.loginusecase.LoginUseCase.*

interface LoginUseCase: BaseUseCase<Request, Response> {
    data class Request(
        val userName: String,
        val password: String
    ) : BaseRequest()

    data class Response(
        val message: String
    ) : BaseResponse()
}
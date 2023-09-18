package com.br.kmmdemo.usecases.loginusecase

import com.br.kmmdemo.usecases.loginusecase.LoginUseCase.*

class LoginInteractor : LoginUseCase {
    //    FIXME - Replace example code
    override suspend fun invoke(request: Request?) =
        request.assertNotNull { Result.success(Response("Success!")) }
}
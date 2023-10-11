package com.br.kmmdemo.usecases.loginusecase

import com.br.kmmdemo.usecases.loginusecase.LoginUseCase.InvalidUserName
import com.br.kmmdemo.usecases.loginusecase.LoginUseCase.Request
import com.br.kmmdemo.usecases.loginusecase.LoginUseCase.Response

class LoginInteractor : LoginUseCase {
    //    FIXME - Replace example code
    override suspend fun invoke(request: Request?) =
        request.assertNotNull {
            if (it.userName.isEmpty()) throw InvalidUserName()

            Result.success(Response("Success!"))
        }
}

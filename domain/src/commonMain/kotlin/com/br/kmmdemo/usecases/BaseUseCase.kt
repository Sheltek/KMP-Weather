package com.br.kmmdemo.usecases

import com.br.kmmdemo.usecases.BaseUseCase.*
import org.koin.core.component.KoinComponent

interface BaseUseCase<Request : BaseRequest, Response : BaseResponse> : KoinComponent {
    open class BaseRequest
    open class BaseResponse

    suspend fun invoke(request: Request? = null): Result<Response>

    suspend fun Request?.assertNotNull(block: suspend (Request) -> Result<Response>) =
        this?.let { block(it) } ?: Result.failure(IllegalArgumentException("Request required"))
}
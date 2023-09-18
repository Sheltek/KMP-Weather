package com.br.kmmdemo.di

import com.br.kmmdemo.usecases.loginusecase.LoginInteractor
import com.br.kmmdemo.usecases.loginusecase.LoginUseCase
import org.koin.dsl.module

val domainModule = module {
    // Use Cases
    single<LoginUseCase> { LoginInteractor() }

}
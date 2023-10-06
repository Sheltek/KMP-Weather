package com.br.kmmdemo.viewmodels

import com.br.kmmdemo.models.Forecast
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityInteractor
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ForecastViewModel : KoinComponent {
    // TODO NEED TO LOOK INTO VIEW MODEL OPTION

    val dispatcher = Dispatchers.Default
    private val forecastUseCase: ForecastForCityInteractor by inject()

    val forecast: MutableStateFlow<Forecast?> = MutableStateFlow(null)

    fun fetchForecast() {
        CoroutineScope(dispatcher).launch {
            val fetchedForecast = forecastUseCase.invoke(
                ForecastForCityUseCase.Request("Dallas")
            )
            forecast.emit(fetchedForecast.getOrNull()?.forecast)
        }
    }
}
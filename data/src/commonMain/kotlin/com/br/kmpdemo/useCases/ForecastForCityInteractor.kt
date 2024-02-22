
import com.br.kmpdemo.repositories.WeatherRepository
import com.br.kmpdemo.usecases.forecastusecase.ForecastForCityUseCase
import com.br.kmpdemo.usecases.forecastusecase.ForecastForCityUseCase.InvalidCityName
import com.br.kmpdemo.usecases.forecastusecase.ForecastForCityUseCase.Request
import com.br.kmpdemo.usecases.forecastusecase.ForecastForCityUseCase.Response
import org.koin.core.component.inject

class ForecastForCityInteractor: ForecastForCityUseCase {
    private val weatherRepo: WeatherRepository by inject()
    override suspend fun invoke(request: Request?): Result<Response> =

        request assertNotNull { forecastRequest ->
            if (forecastRequest.city.isBlank()) throw InvalidCityName()
            val result = weatherRepo.getForecastForCity(forecastRequest.city)
            Result.success(Response(result.getOrNull()))
        }
}
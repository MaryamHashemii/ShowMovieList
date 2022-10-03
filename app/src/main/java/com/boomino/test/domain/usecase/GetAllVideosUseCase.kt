package com.boomino.test.domain.usecase

import com.boomino.test.di.coroutine.IoDispatcher
import com.boomino.test.domain.model.ItemVideo
import com.boomino.test.domain.repository.AppRepository
import com.boomino.test.domain.usecase.coroutin.FlowUseCase
import com.boomino.test.result.Result
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetAllVideosUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
) : FlowUseCase<Pair<String, Int>, List<ItemVideo>>(coroutineDispatcher) {

    override suspend fun execute(parameters: Pair<String, Int>): Flow<Result<List<ItemVideo>>> {
        return appRepository.getCategorizedVideo(parameters.first, parameters.second)
            .map {
                Result.Success(it)
            }
            .catch {
                if (it is Exception)
                    Result.Error(it)
            }
    }
}
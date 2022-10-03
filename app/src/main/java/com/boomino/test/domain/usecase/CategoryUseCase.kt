package com.boomino.test.domain.usecase

import com.boomino.test.data.remote.dto.response.Category
import com.boomino.test.di.coroutine.IoDispatcher
import com.boomino.test.domain.repository.AppRepository
import com.boomino.test.domain.usecase.coroutin.FlowUseCase
import com.boomino.test.result.Result
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class CategoryUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
) : FlowUseCase<Unit, List<Category>>(coroutineDispatcher) {

    override suspend fun execute(parameters:Unit): Flow<Result<List<Category>>> {
        return appRepository.getCategories()
            .map {
                Result.Success(it)
            }
            .catch {
                if (it is Exception)
                    Result.Error(it)
            }
    }
}
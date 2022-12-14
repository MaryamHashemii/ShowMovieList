package com.boomino.test.domain.usecase.coroutin

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn

import com.boomino.test.result.Result

abstract class FlowUseCase<in P, R>(private val coroutineDispatcher: CoroutineDispatcher) {
   suspend operator fun invoke(parameters: P): Flow<Result<R>> = execute(parameters)
        .catch { e -> emit(Result.Error(Exception(e))) }
        .flowOn(coroutineDispatcher)

    protected abstract suspend fun execute(parameters: P): Flow<Result<R>>
}

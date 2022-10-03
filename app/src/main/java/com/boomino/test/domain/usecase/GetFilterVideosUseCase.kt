package com.boomino.test.domain.usecase

import com.boomino.test.di.coroutine.IoDispatcher
import com.boomino.test.domain.model.ItemVideo
import com.boomino.test.domain.repository.AppRepository
import com.boomino.test.domain.usecase.coroutin.UseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetFilterVideosUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
) : UseCase<Pair<String, Int>, List<ItemVideo>>(coroutineDispatcher) {

    override suspend fun execute(parameters: Pair<String,Int>): List<ItemVideo> {
        return appRepository.getFilterCategorizedVideos(parameters.first,parameters.second)

    }
}
package com.boomino.test

import com.boomino.test.domain.repository.AppRepository
import com.boomino.test.domain.usecase.GetFilterVideosUseCase
import com.boomino.test.result.data
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetFilterVideosUseCaseUnitTest {

    @Mock
    lateinit var getFilterVideosUseCase: GetFilterVideosUseCase

    @Before
    fun setUp() {
        val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO
        val appRepository = Mockito.mock(AppRepository::class.java)
        getFilterVideosUseCase = GetFilterVideosUseCase(appRepository, coroutineDispatcher)
    }

    @Test
    fun is_category_list_null() = runBlocking {
        assertEquals(null, getFilterVideosUseCase(Pair("", 0)).data)
    }
}
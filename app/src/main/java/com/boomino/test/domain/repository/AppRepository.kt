package com.boomino.test.domain.repository

import com.boomino.test.data.remote.dto.response.Category
import com.boomino.test.domain.model.ItemVideo
import kotlinx.coroutines.flow.Flow

interface AppRepository {

    suspend fun getCategorizedVideo(categoryId:String,page:Int): Flow<List<ItemVideo>>
    suspend fun getFilterCategorizedVideos(categoryId:String,page: Int): List<ItemVideo>
    suspend fun getCategories():Flow<List<Category>>

}
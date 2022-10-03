package com.boomino.test.data.remote

import com.boomino.test.data.remote.dto.response.CategorizedVideo
import com.boomino.test.data.remote.dto.response.CategoryResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("categoryVideos/cat/{categoryId}/perpage/{page}")
    suspend fun getCategorizedVideo(
        @Path("categoryId") categoryId: String ,
        @Path("page") page: Int
    ): CategorizedVideo

    @GET("categories")
    suspend fun getCategories(): CategoryResponse


}
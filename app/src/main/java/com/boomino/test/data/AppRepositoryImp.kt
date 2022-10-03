package com.boomino.test.data

import com.boomino.test.data.local.dao.AppDao
import com.boomino.test.data.remote.ApiService
import com.boomino.test.data.remote.dto.response.*
import com.boomino.test.domain.repository.AppRepository
import javax.inject.Inject
import com.boomino.test.domain.model.ItemVideo
import com.boomino.test.domain.model.toItemProductRepositoryModelList2
import com.boomino.test.util.NetworkConnectivity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class AppRepositoryImp @Inject constructor(
    private val apiService: ApiService,
    private val appDao: AppDao,
    private val networkConnectivity: NetworkConnectivity
) : AppRepository {
    override suspend fun getCategorizedVideo(categoryId: String, page: Int): Flow<List<ItemVideo>> {
        try {
            if (networkConnectivity.isInternetOn()) {
                val result = apiService.getCategorizedVideo(
                    categoryId,
                    page
                ).categoryvideos.toItemVideoRepositoryList()
                appDao.saveCategorizedVideoRepositories(
                    result
                )
            }
        } catch (e: Exception) {

        }
        return appDao.getCategorizedVideosRepositories().map {
            it.toItemProductRepositoryModelList2()
        }
    }

    override suspend fun getFilterCategorizedVideos(
        categoryId: String,
        page: Int
    ): List<ItemVideo> {
        return apiService.getCategorizedVideo(categoryId, page).categoryvideos.toItemVideoList()
    }


    override suspend fun getCategories(): Flow<List<Category>> {
        try {
            appDao.saveCategoriesRepositories(apiService.getCategories().categories.toCategoryRepositoryModelList())
        } catch (e: Exception) {
        }

        return appDao.getCategoriesRepositories().map {
            it.toCategoryList()
        }
    }
}


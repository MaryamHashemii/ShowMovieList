package com.boomino.test.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.boomino.test.domain.repository.AppRepository
import com.boomino.test.data.AppRepositoryImp
import com.boomino.test.data.local.dao.AppDao
import com.boomino.test.data.remote.ApiService
import com.boomino.test.util.NetworkConnectivity
import dagger.Provides
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAppRepository(
        apiService: ApiService,
        appDao: AppDao,
        networkConnectivity: NetworkConnectivity
    ): AppRepository {
        return AppRepositoryImp(apiService, appDao,networkConnectivity)
    }

}
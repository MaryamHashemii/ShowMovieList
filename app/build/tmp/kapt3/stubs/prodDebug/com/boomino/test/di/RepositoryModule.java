package com.boomino.test.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/boomino/test/di/RepositoryModule;", "", "()V", "provideAppRepository", "Lcom/boomino/test/domain/repository/AppRepository;", "apiService", "Lcom/boomino/test/data/remote/ApiService;", "appDao", "Lcom/boomino/test/data/local/dao/AppDao;", "networkConnectivity", "Lcom/boomino/test/util/NetworkConnectivity;", "app_prodDebug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.boomino.test.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.boomino.test.domain.repository.AppRepository provideAppRepository(@org.jetbrains.annotations.NotNull()
    com.boomino.test.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.boomino.test.data.local.dao.AppDao appDao, @org.jetbrains.annotations.NotNull()
    com.boomino.test.util.NetworkConnectivity networkConnectivity) {
        return null;
    }
}
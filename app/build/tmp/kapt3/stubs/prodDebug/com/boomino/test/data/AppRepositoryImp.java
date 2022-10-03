package com.boomino.test.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ-\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/boomino/test/data/AppRepositoryImp;", "Lcom/boomino/test/domain/repository/AppRepository;", "apiService", "Lcom/boomino/test/data/remote/ApiService;", "appDao", "Lcom/boomino/test/data/local/dao/AppDao;", "networkConnectivity", "Lcom/boomino/test/util/NetworkConnectivity;", "(Lcom/boomino/test/data/remote/ApiService;Lcom/boomino/test/data/local/dao/AppDao;Lcom/boomino/test/util/NetworkConnectivity;)V", "getCategories", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/boomino/test/data/remote/dto/response/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategorizedVideo", "Lcom/boomino/test/domain/model/ItemVideo;", "categoryId", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilterCategorizedVideos", "app_prodDebug"})
public final class AppRepositoryImp implements com.boomino.test.domain.repository.AppRepository {
    private final com.boomino.test.data.remote.ApiService apiService = null;
    private final com.boomino.test.data.local.dao.AppDao appDao = null;
    private final com.boomino.test.util.NetworkConnectivity networkConnectivity = null;
    
    @javax.inject.Inject()
    public AppRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.boomino.test.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.boomino.test.data.local.dao.AppDao appDao, @org.jetbrains.annotations.NotNull()
    com.boomino.test.util.NetworkConnectivity networkConnectivity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCategorizedVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.boomino.test.domain.model.ItemVideo>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFilterCategorizedVideos(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.boomino.test.domain.model.ItemVideo>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.boomino.test.data.remote.dto.response.Category>>> continuation) {
        return null;
    }
}
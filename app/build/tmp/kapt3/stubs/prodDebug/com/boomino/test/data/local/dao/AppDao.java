package com.boomino.test.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/boomino/test/data/local/dao/AppDao;", "", "getCategoriesRepositories", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/boomino/test/data/local/dto/ItemCategoryRepositoryModel;", "getCategorizedVideosRepositories", "Lcom/boomino/test/data/local/dto/ItemVideoRepositoryModel;", "getFilterCategorizedVideosRepositories", "categoryId", "", "saveCategoriesRepositories", "", "categoryList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCategorizedVideoRepositories", "videoList", "app_prodDebug"})
public abstract interface AppDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM video")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.boomino.test.data.local.dto.ItemVideoRepositoryModel>> getCategorizedVideosRepositories();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveCategorizedVideoRepositories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.boomino.test.data.local.dto.ItemVideoRepositoryModel> videoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM video WHERE id = :categoryId")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.boomino.test.data.local.dto.ItemVideoRepositoryModel>> getFilterCategorizedVideosRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM category")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.boomino.test.data.local.dto.ItemCategoryRepositoryModel>> getCategoriesRepositories();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveCategoriesRepositories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.boomino.test.data.local.dto.ItemCategoryRepositoryModel> categoryList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
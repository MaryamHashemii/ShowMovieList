package com.boomino.test.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/boomino/test/data/remote/ApiService;", "", "getCategories", "Lcom/boomino/test/data/remote/dto/response/CategoryResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategorizedVideo", "Lcom/boomino/test/data/remote/dto/response/CategorizedVideo;", "categoryId", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "categoryVideos/cat/{categoryId}/perpage/{page}")
    public abstract java.lang.Object getCategorizedVideo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "categoryId")
    java.lang.String categoryId, @retrofit2.http.Path(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.boomino.test.data.remote.dto.response.CategorizedVideo> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "categories")
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.boomino.test.data.remote.dto.response.CategoryResponse> continuation);
}
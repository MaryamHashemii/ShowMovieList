package com.boomino.test.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/boomino/test/domain/usecase/GetFilterVideosUseCase;", "Lcom/boomino/test/domain/usecase/coroutin/UseCase;", "Lkotlin/Pair;", "", "", "", "Lcom/boomino/test/domain/model/ItemVideo;", "appRepository", "Lcom/boomino/test/domain/repository/AppRepository;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/boomino/test/domain/repository/AppRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class GetFilterVideosUseCase extends com.boomino.test.domain.usecase.coroutin.UseCase<kotlin.Pair<? extends java.lang.String, ? extends java.lang.Integer>, java.util.List<? extends com.boomino.test.domain.model.ItemVideo>> {
    private final com.boomino.test.domain.repository.AppRepository appRepository = null;
    
    @javax.inject.Inject()
    public GetFilterVideosUseCase(@org.jetbrains.annotations.NotNull()
    com.boomino.test.domain.repository.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @com.boomino.test.di.coroutine.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, java.lang.Integer> parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.boomino.test.domain.model.ItemVideo>> continuation) {
        return null;
    }
}
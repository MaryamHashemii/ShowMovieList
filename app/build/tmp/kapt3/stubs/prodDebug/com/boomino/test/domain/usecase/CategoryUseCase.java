package com.boomino.test.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/boomino/test/domain/usecase/CategoryUseCase;", "Lcom/boomino/test/domain/usecase/coroutin/FlowUseCase;", "", "", "Lcom/boomino/test/data/remote/dto/response/Category;", "appRepository", "Lcom/boomino/test/domain/repository/AppRepository;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/boomino/test/domain/repository/AppRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/boomino/test/result/Result;", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class CategoryUseCase extends com.boomino.test.domain.usecase.coroutin.FlowUseCase<kotlin.Unit, java.util.List<? extends com.boomino.test.data.remote.dto.response.Category>> {
    private final com.boomino.test.domain.repository.AppRepository appRepository = null;
    
    @javax.inject.Inject()
    public CategoryUseCase(@org.jetbrains.annotations.NotNull()
    com.boomino.test.domain.repository.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @com.boomino.test.di.coroutine.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.boomino.test.result.Result<? extends java.util.List<com.boomino.test.data.remote.dto.response.Category>>>> continuation) {
        return null;
    }
}
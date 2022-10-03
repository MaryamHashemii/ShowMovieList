package com.boomino.test.presentation.video;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u000e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014\u00a8\u0006&"}, d2 = {"Lcom/boomino/test/presentation/video/VideoViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllVideosUseCase", "Lcom/boomino/test/domain/usecase/GetAllVideosUseCase;", "getFilterVideosUseCase", "Lcom/boomino/test/domain/usecase/GetFilterVideosUseCase;", "categoryUseCase", "Lcom/boomino/test/domain/usecase/CategoryUseCase;", "(Lcom/boomino/test/domain/usecase/GetAllVideosUseCase;Lcom/boomino/test/domain/usecase/GetFilterVideosUseCase;Lcom/boomino/test/domain/usecase/CategoryUseCase;)V", "_searchVideoLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/boomino/test/domain/model/ItemVideo;", "_videoFilterLiveData", "Lcom/boomino/test/result/Result;", "_videoLiveData", "category", "Landroidx/lifecycle/LiveData;", "Lcom/boomino/test/data/remote/dto/response/Category;", "getCategory", "()Landroidx/lifecycle/LiveData;", "searchVideoLiveData", "getSearchVideoLiveData", "videoFilterLiveData", "getVideoFilterLiveData", "videoLiveData", "getVideoLiveData", "getCategorizedVideo", "", "categoryId", "", "page", "", "getFilterVideos", "getSearchVideoList", "word", "isLocalEnable", "", "app_prodDebug"})
public final class VideoViewModel extends androidx.lifecycle.ViewModel {
    private final com.boomino.test.domain.usecase.GetAllVideosUseCase getAllVideosUseCase = null;
    private final com.boomino.test.domain.usecase.GetFilterVideosUseCase getFilterVideosUseCase = null;
    private final com.boomino.test.domain.usecase.CategoryUseCase categoryUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.domain.model.ItemVideo>>> _videoLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.domain.model.ItemVideo>>> videoLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.domain.model.ItemVideo>>> _videoFilterLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.domain.model.ItemVideo>>> videoFilterLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.boomino.test.domain.model.ItemVideo>> _searchVideoLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.boomino.test.domain.model.ItemVideo>> searchVideoLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.data.remote.dto.response.Category>>> category = null;
    
    @javax.inject.Inject()
    public VideoViewModel(@org.jetbrains.annotations.NotNull()
    com.boomino.test.domain.usecase.GetAllVideosUseCase getAllVideosUseCase, @org.jetbrains.annotations.NotNull()
    com.boomino.test.domain.usecase.GetFilterVideosUseCase getFilterVideosUseCase, @org.jetbrains.annotations.NotNull()
    com.boomino.test.domain.usecase.CategoryUseCase categoryUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.domain.model.ItemVideo>>> getVideoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.domain.model.ItemVideo>>> getVideoFilterLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.boomino.test.domain.model.ItemVideo>> getSearchVideoLiveData() {
        return null;
    }
    
    public final void getCategorizedVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, int page) {
    }
    
    public final void getSearchVideoList(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isLocalEnable) {
    }
    
    public final void getFilterVideos(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, int page) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.boomino.test.result.Result<java.util.List<com.boomino.test.data.remote.dto.response.Category>>> getCategory() {
        return null;
    }
}
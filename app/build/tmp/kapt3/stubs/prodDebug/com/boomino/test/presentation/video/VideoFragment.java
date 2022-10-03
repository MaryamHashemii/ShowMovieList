package com.boomino.test.presentation.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/boomino/test/presentation/video/VideoFragment;", "Lcom/boomino/test/base/ObserverDataBindingFragment;", "Lcom/boomino/test/databinding/FragmentVideoBinding;", "()V", "categoryAdapter", "Lcom/boomino/test/presentation/video/CategoryAdapter;", "getCategoryAdapter", "()Lcom/boomino/test/presentation/video/CategoryAdapter;", "setCategoryAdapter", "(Lcom/boomino/test/presentation/video/CategoryAdapter;)V", "isLocalEnable", "", "videoAdapter", "Lcom/boomino/test/presentation/video/VideoAdapter;", "getVideoAdapter", "()Lcom/boomino/test/presentation/video/VideoAdapter;", "setVideoAdapter", "(Lcom/boomino/test/presentation/video/VideoAdapter;)V", "videoViewModel", "Lcom/boomino/test/presentation/video/VideoViewModel;", "getVideoViewModel", "()Lcom/boomino/test/presentation/video/VideoViewModel;", "videoViewModel$delegate", "Lkotlin/Lazy;", "observe", "", "observeCategory", "observeSearch", "observeVideoByCategory", "observeVideoFromLocal", "setUpCategoryRecyclerView", "setUpVideoRecyclerView", "setupViews", "app_prodDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class VideoFragment extends com.boomino.test.base.ObserverDataBindingFragment<com.boomino.test.databinding.FragmentVideoBinding> {
    private final kotlin.Lazy videoViewModel$delegate = null;
    @javax.inject.Inject()
    public com.boomino.test.presentation.video.VideoAdapter videoAdapter;
    @javax.inject.Inject()
    public com.boomino.test.presentation.video.CategoryAdapter categoryAdapter;
    private boolean isLocalEnable = true;
    
    public VideoFragment() {
        super(0);
    }
    
    private final com.boomino.test.presentation.video.VideoViewModel getVideoViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.boomino.test.presentation.video.VideoAdapter getVideoAdapter() {
        return null;
    }
    
    public final void setVideoAdapter(@org.jetbrains.annotations.NotNull()
    com.boomino.test.presentation.video.VideoAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.boomino.test.presentation.video.CategoryAdapter getCategoryAdapter() {
        return null;
    }
    
    public final void setCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.boomino.test.presentation.video.CategoryAdapter p0) {
    }
    
    @java.lang.Override()
    protected void setupViews() {
    }
    
    private final void setUpVideoRecyclerView() {
    }
    
    private final void setUpCategoryRecyclerView() {
    }
    
    @java.lang.Override()
    protected void observe() {
    }
    
    private final void observeVideoFromLocal() {
    }
    
    private final void observeVideoByCategory() {
    }
    
    private final void observeCategory() {
    }
    
    private final void observeSearch() {
    }
}
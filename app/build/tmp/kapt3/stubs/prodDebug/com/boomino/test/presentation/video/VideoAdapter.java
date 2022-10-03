package com.boomino.test.presentation.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/boomino/test/presentation/video/VideoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "imageLoadingService", "Lcom/boomino/test/common/imageloading/ImageLoadingService;", "(Lcom/boomino/test/common/imageloading/ImageLoadingService;)V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_LOADING", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/boomino/test/domain/model/ItemVideo;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "data", "", "EmptyViewHolder", "VideoViewHolder", "app_prodDebug"})
public final class VideoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.boomino.test.common.imageloading.ImageLoadingService imageLoadingService = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.boomino.test.domain.model.ItemVideo, kotlin.Unit> onItemClick;
    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.boomino.test.domain.model.ItemVideo> diffCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.boomino.test.domain.model.ItemVideo> differ = null;
    
    @javax.inject.Inject()
    public VideoAdapter(@org.jetbrains.annotations.NotNull()
    com.boomino.test.common.imageloading.ImageLoadingService imageLoadingService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.boomino.test.domain.model.ItemVideo, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.boomino.test.domain.model.ItemVideo, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.boomino.test.domain.model.ItemVideo> data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/boomino/test/presentation/video/VideoAdapter$VideoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/boomino/test/databinding/ItemVideoBinding;", "imageLoadingService", "Lcom/boomino/test/common/imageloading/ImageLoadingService;", "onItemClick", "Lkotlin/Function1;", "Lcom/boomino/test/domain/model/ItemVideo;", "", "(Lcom/boomino/test/databinding/ItemVideoBinding;Lcom/boomino/test/common/imageloading/ImageLoadingService;Lkotlin/jvm/functions/Function1;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "bind", "data", "app_prodDebug"})
    public static final class VideoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.boomino.test.databinding.ItemVideoBinding binding = null;
        private final com.boomino.test.common.imageloading.ImageLoadingService imageLoadingService = null;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super com.boomino.test.domain.model.ItemVideo, kotlin.Unit> onItemClick;
        
        public VideoViewHolder(@org.jetbrains.annotations.NotNull()
        com.boomino.test.databinding.ItemVideoBinding binding, @org.jetbrains.annotations.NotNull()
        com.boomino.test.common.imageloading.ImageLoadingService imageLoadingService, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.boomino.test.domain.model.ItemVideo, kotlin.Unit> onItemClick) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<com.boomino.test.domain.model.ItemVideo, kotlin.Unit> getOnItemClick() {
            return null;
        }
        
        public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.boomino.test.domain.model.ItemVideo, kotlin.Unit> p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.boomino.test.domain.model.ItemVideo data) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/boomino/test/presentation/video/VideoAdapter$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/boomino/test/databinding/ItemLoadingBinding;", "(Lcom/boomino/test/databinding/ItemLoadingBinding;)V", "bind", "", "app_prodDebug"})
    public static final class EmptyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.boomino.test.databinding.ItemLoadingBinding binding = null;
        
        public EmptyViewHolder(@org.jetbrains.annotations.NotNull()
        com.boomino.test.databinding.ItemLoadingBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
}
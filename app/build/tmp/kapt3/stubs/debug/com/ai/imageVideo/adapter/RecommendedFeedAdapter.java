package com.ai.imageVideo.adapter;

import java.lang.System;

/**
 * Created by yaoletian on 2023/4/5.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/ai/imageVideo/adapter/RecommendedFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ai/imageVideo/adapter/RecommendedFeedAdapter$ViewHolder;", "context", "Landroid/content/Context;", "datas", "", "Lcom/ai/imageVideo/bean/RecommendedFeedBeen;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateAdapter", "data", "ViewHolder", "app_debug"})
public final class RecommendedFeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ai.imageVideo.adapter.RecommendedFeedAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.ai.imageVideo.bean.RecommendedFeedBeen> datas;
    
    public RecommendedFeedAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ai.imageVideo.bean.RecommendedFeedBeen> datas) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ai.imageVideo.bean.RecommendedFeedBeen> getDatas() {
        return null;
    }
    
    public final void setDatas(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ai.imageVideo.bean.RecommendedFeedBeen> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ai.imageVideo.adapter.RecommendedFeedAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ai.imageVideo.adapter.RecommendedFeedAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ai.imageVideo.bean.RecommendedFeedBeen> data) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/ai/imageVideo/adapter/RecommendedFeedAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ai/imageVideo/adapter/RecommendedFeedAdapter;Landroid/view/View;)V", "ivBig", "Landroid/widget/ImageView;", "getIvBig", "()Landroid/widget/ImageView;", "ivDraw", "getIvDraw", "ivIcon", "getIvIcon", "ivLike", "getIvLike", "ivShare", "getIvShare", "ivUnlike", "getIvUnlike", "tvDesc", "Landroid/widget/TextView;", "getTvDesc", "()Landroid/widget/TextView;", "tvLike", "getTvLike", "tvUnLike", "getTvUnLike", "tvUserName", "getTvUserName", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivBig = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivDraw = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvUserName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvLike = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvUnLike = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivUnlike = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivLike = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivShare = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvDesc = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvBig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvDraw() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvUserName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvLike() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvUnLike() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvUnlike() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvLike() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvShare() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDesc() {
            return null;
        }
    }
}
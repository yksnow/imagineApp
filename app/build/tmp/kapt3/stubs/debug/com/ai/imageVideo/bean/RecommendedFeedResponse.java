package com.ai.imageVideo.bean;

import java.lang.System;

/**
 * Created by yaoletian on 2023/4/4.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/ai/imageVideo/bean/RecommendedFeedResponse;", "Ljava/io/Serializable;", "()V", "data", "Lcom/ai/imageVideo/bean/RecommendedFeedData;", "getData", "()Lcom/ai/imageVideo/bean/RecommendedFeedData;", "setData", "(Lcom/ai/imageVideo/bean/RecommendedFeedData;)V", "error_code", "", "getError_code", "()I", "setError_code", "(I)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "app_debug"})
public final class RecommendedFeedResponse implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private com.ai.imageVideo.bean.RecommendedFeedData data;
    private int error_code = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    
    public RecommendedFeedResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ai.imageVideo.bean.RecommendedFeedData getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.ai.imageVideo.bean.RecommendedFeedData p0) {
    }
    
    public final int getError_code() {
        return 0;
    }
    
    public final void setError_code(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}
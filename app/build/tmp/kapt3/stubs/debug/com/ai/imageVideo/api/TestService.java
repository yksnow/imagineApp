package com.ai.imageVideo.api;

import java.lang.System;

/**
 * Created by yaoletian on 2023/4/4.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/ai/imageVideo/api/TestService;", "", "recommendedFeed", "Lretrofit2/Call;", "Lcom/ai/imageVideo/bean/RecommendedFeedResponse;", "page", "", "page_size", "app_debug"})
public abstract interface TestService {
    
    /**
     * recommended_feed - get recommended feed without login
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/public/recommended_feed")
    public abstract retrofit2.Call<com.ai.imageVideo.bean.RecommendedFeedResponse> recommendedFeed(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "page_size")
    int page_size);
}
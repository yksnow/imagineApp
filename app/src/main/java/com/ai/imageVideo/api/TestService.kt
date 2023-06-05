package com.ai.imageVideo.api

import com.ai.imageVideo.bean.RecommendedFeedResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by yaoletian on 2023/4/4.
 */
interface TestService {
    /**
     * recommended_feed - get recommended feed without login
     */
    @GET("/api/public/recommended_feed")
    fun recommendedFeed(
        @Query("page") page: Int,
        @Query("page_size") page_size: Int
    ): Call<RecommendedFeedResponse>
}
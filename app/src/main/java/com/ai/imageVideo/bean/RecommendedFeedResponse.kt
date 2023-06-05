package com.ai.imageVideo.bean

import java.io.Serializable

/**
 * Created by yaoletian on 2023/4/4.
 */
class RecommendedFeedResponse : Serializable {
    var data: RecommendedFeedData? = null
    var error_code: Int = 0
    var message: String? = null
}
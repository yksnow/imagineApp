package com.example.test.bean

import java.io.Serializable

/**
 * Created by yaoletian on 2023/4/4.
 */
class RecommendedFeedData: Serializable {
    var data: List<RecommendedFeedBeen>? = null
    var count = 0
    var page = 0
    var pageCount = 0
    var pageSize = 0
}
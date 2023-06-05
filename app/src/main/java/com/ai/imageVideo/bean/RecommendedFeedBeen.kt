package com.ai.imageVideo.bean

import java.io.Serializable

/**
 * Created by yaoletian on 2023/4/4.
 */
class RecommendedFeedBeen : Serializable {
    var has_created_permission = false
    var id: String? = null
    var is_author = false
    var is_followed = false
    var is_liked = false
    var media_h5_url: String? = null
    var num_likes = 0
    var num_views = 0
    var owner_id = 0
    var owner_name: String = ""
    var owner_profile: String? = null
    var prompt: String? = null
    var structured_prompt: StructuredPrompt? = null
    var style_id: String? = null
    var style_name: String? = null
    var type: String? = null
    var url: String? = null

    inner class StructuredPrompt {
        var character_infos: List<CharacterInfos>? = null
        var partial_prompt: String? = null
        var style_id: String? = null
        var drawed_pic:String?= null
    }

    inner class CharacterInfos {
        var character_id: String? = null
        var character_type = 0
    }
}
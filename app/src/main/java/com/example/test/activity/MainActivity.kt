package com.example.test.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.R
import com.example.test.adapter.RecommendedFeedAdapter
import com.example.test.api.TestService
import com.example.test.bean.RecommendedFeedBeen
import com.example.test.bean.RecommendedFeedResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private var feedList = ArrayList<RecommendedFeedBeen>()
    private lateinit var feedAdapter:RecommendedFeedAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutManager = LinearLayoutManager(this)
        rv_feed.layoutManager = layoutManager
        feedAdapter = RecommendedFeedAdapter(this, feedList)
        rv_feed.adapter = feedAdapter
        getFeed()
    }

    fun getFeed() {
        val retrofit = Retrofit.Builder().baseUrl("http://34.170.166.132:8081/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val addService = retrofit.create(TestService::class.java)
        addService.recommendedFeed(0, 100).enqueue(object : Callback<RecommendedFeedResponse> {
            override fun onResponse(
                call: Call<RecommendedFeedResponse>,
                response: Response<RecommendedFeedResponse>
            ) {
                feedList = response.body()?.data?.data as ArrayList<RecommendedFeedBeen>
                feedAdapter.updateAdapter(feedList)
            }

            override fun onFailure(call: Call<RecommendedFeedResponse>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}
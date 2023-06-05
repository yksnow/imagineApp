package com.ai.imageVideo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ai.imageVideo.adapter.RecommendedFeedAdapter
import com.ai.imageVideo.api.TestService
import com.ai.imageVideo.bean.RecommendedFeedBeen
import com.ai.imageVideo.bean.RecommendedFeedResponse
import com.ai.imageVideo.databinding.FragmentExploreBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ExploreFragment : BaseFragment() {
    private var feedList = ArrayList<RecommendedFeedBeen>()
    private lateinit var feedAdapter: RecommendedFeedAdapter
    private lateinit var exploreBinding: FragmentExploreBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        exploreBinding = FragmentExploreBinding.inflate(inflater,container,false)
        val rootView:View = exploreBinding.root
        val layoutManager = LinearLayoutManager(context)
        feedAdapter = RecommendedFeedAdapter(requireContext(), feedList)
        with(exploreBinding){
            rvFeed.layoutManager = layoutManager
            rvFeed.adapter = feedAdapter
        }
        getFeed()
        return rootView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun getFeed() {
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
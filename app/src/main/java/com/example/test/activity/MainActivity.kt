package com.example.test.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.test.R
import com.example.test.adapter.RecommendedFeedAdapter
import com.example.test.adapter.ViewPagerAdapter
import com.example.test.api.TestService
import com.example.test.bean.RecommendedFeedBeen
import com.example.test.bean.RecommendedFeedResponse
import com.example.test.databinding.ActivityMainBinding
import com.example.test.fragment.ExploreFragment
import com.example.test.fragment.ProfileFragment
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : BaseActivity() {
    private var feedList = ArrayList<RecommendedFeedBeen>()
    private lateinit var feedAdapter: RecommendedFeedAdapter
    private lateinit var mainBinding: ActivityMainBinding
    private var fragmentList = ArrayList<Fragment>()
    //    private lateinit var ViewPage: ViewPager
    private lateinit var menuItem: MenuItem

    //    private lateinit var BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val layoutManager = LinearLayoutManager(this)
        feedAdapter = RecommendedFeedAdapter(this, feedList)
//        with(mainBinding){
//            rvFeed.layoutManager = layoutManager
//            rvFeed.adapter = feedAdapter
//            btnStart.setOnClickListener {
//                val  intent = Intent(this@MainActivity,DrawActivity::class.java)
//                startActivity(intent)
//            }
//        }
        setNavigationView()
        initViewPage()

        //getFeed()
    }

    private fun setNavigationView() {
        mainBinding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.explore -> mainBinding.vp.currentItem = 0
                R.id.profile -> mainBinding.vp.currentItem = 1
            }

            false
        }
    }

    private fun initViewPage() {
        setUpViewPager(mainBinding.vp)
        mainBinding.vp.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                if (menuItem != null) menuItem.isChecked = false
                else mainBinding.bottomNavigation.menu.getItem(0).isChecked = false;
                menuItem = mainBinding.bottomNavigation.menu.getItem(position)
                menuItem.isChecked = true
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }
            //            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onPageSelected(position: Int) {
//                if (menuItem != null) menuItem.isChecked = false
//                else mainBinding.bottomNavigation.menu.getItem(0).isChecked = false;
//                menuItem = mainBinding.bottomNavigation.menu.getItem(position)
//                menuItem.isChecked = true
//            }
//
//            override fun onPageScrollStateChanged(state: Int) {
//                TODO("Not yet implemented")
//            }

        })

//        mainBinding.vp.setOnTouchListener(object: View.OnTouchListener{
//            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
//                return true
//            }
//
//        })

    }

    private fun setUpViewPager(vp: ViewPager2) {
        
        fragmentList.add(ExploreFragment())
        fragmentList.add(ProfileFragment())
       val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle,fragmentList)
        mainBinding.vp.adapter = adapter
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


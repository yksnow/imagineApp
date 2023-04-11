package com.example.test.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.test.R
import com.example.test.adapter.ViewPagerAdapter
import com.example.test.databinding.ActivityMainBinding
import com.example.test.fragment.ExploreFragment
import com.example.test.fragment.ProfileFragment
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task


class MainActivity : BaseActivity(), View.OnClickListener {
    companion object {
        const val RC_SIGN_IN = 123
    }


    private lateinit var mainBinding: ActivityMainBinding
    private var fragmentList = ArrayList<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.ivLogin.setOnClickListener(this)
        setNavigationView()
//        mainBinding.bottomNavigation.menu.getItem(0).isChecked = true
        initViewPage()

        //getFeed()
    }

    private fun setNavigationView() {
        mainBinding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                com.example.test.R.id.explore -> mainBinding.vp.currentItem = 0
                com.example.test.R.id.profile -> mainBinding.vp.currentItem = 1
            }
            true
        }
    }

    private fun initViewPage() {
        mainBinding.vp.isUserInputEnabled = false
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
                mainBinding.bottomNavigation.menu.getItem(position).isChecked = true
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

        })
    }

    private fun setUpViewPager(vp: ViewPager2) {
        fragmentList.add(ExploreFragment())
        fragmentList.add(ProfileFragment())
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, fragmentList)
        mainBinding.vp.adapter = adapter
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            com.example.test.R.id.iv_login -> {
//                this.startActivity1<DrawActivity>()
//                googleSignIn()
                this.startActivity1<DemoActivity>()
            }
        }
    }

    private fun googleSignIn() {
        //初始化gso，server_client_id为添加的客户端id
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestId()
            .requestIdToken(getString(R.string.server_client_id))
            .requestEmail()
            .build()
        //初始化Google登录实例,activity为当前activity
        val mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        //登录前可以查看是否已经授权，已经授权则可不必重复授权，如果返回的额account不为空则已经授权，同理activity为当前activity
        val account = GoogleSignIn.getLastSignedInAccount(this)
        if (account != null) {
            startActivity1<DrawActivity>()
        } else {
            //如果未授权则可以调用登录，mGoogleSignInClient为初始化好的Google登录实例，RC_SIGN_IN为随意唯一返回标识码，int即可。
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

    }


    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) { //请求google登录的返回
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)
            //登录成功获取用户信息
            println(account.id)
            println(account.email)
        } catch (e: ApiException) {
            //登录失败
            Log.w("TAG", "signInResult:failed code=" + e.statusCode)
        }
    }
}


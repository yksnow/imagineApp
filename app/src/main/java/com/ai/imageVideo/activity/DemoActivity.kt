package com.ai.imageVideo.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ai.imageVideo.activity.MainActivity.Companion.RC_SIGN_IN
import com.ai.imageVideo.databinding.ActivityDemoBinding
import com.ai.imageVideo.utils.showToast
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task


/**
 * Created by yaoletian on 2023/4/11.
 */
class DemoActivity:BaseActivity() {
    private lateinit var demoBinding: ActivityDemoBinding
    private lateinit var mGoogleSignInClient: GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        demoBinding = ActivityDemoBinding.inflate(layoutInflater)
        setContentView(demoBinding.root)
        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestIdToken("217364888066-le7gdmtvcbpg0qf3o975rdps28j1nhmq.apps.googleusercontent.com")
            .requestEmail()
            .build()
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        demoBinding.signInButton.setOnClickListener{
            signIn()
        }
        demoBinding.btnSignOut.setOnClickListener {
            signOut()
        }
    }
    private fun signIn() {
        val signInIntent: Intent = mGoogleSignInClient.getSignInIntent()
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    private fun signOut() {
        //退出登录
        mGoogleSignInClient.signOut()
            .addOnCompleteListener(this) {
                "退出登录".showToast(Toast.LENGTH_SHORT)
            }
        //解除帐号关联
        mGoogleSignInClient.revokeAccess()
            .addOnCompleteListener(this) {
                "解除账号关联".showToast(Toast.LENGTH_SHORT)
            }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e("resultCode",resultCode.toString())
        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    override fun onStart() {
        super.onStart()
        val account = GoogleSignIn.getLastSignedInAccount(this)
        if (account != null) {
            Log.e("sdsd",account.email.toString())
        }else{
            Log.e("sdsd2222","退出账号了")
        }
    }
    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)
            if (account != null) {
                Log.e("sdsd111",account.email.toString()+";"+account.id+";"
                +account.displayName+";"+account.idToken)
            }
            // Signed in successfully, show authenticated UI.
//            updateUI(account)
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.

            Log.w("343434", "signInResult:failed code=" + e.statusCode)
//            updateUI(null)
        }
    }
}
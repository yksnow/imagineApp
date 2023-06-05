package com.ai.imageVideo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ai.imageVideo.databinding.FragmentLoginBinding
class LoginFragment :BaseFragment() {
    private lateinit var loginBinding: FragmentLoginBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginBinding = FragmentLoginBinding.inflate(inflater,container,false)
        val rootView: View = loginBinding.root
        return rootView
    }
}
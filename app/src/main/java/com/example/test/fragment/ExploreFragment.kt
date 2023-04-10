package com.example.test.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test.databinding.FragmentExploreBinding

class ExploreFragment : BaseFragment() {

    private lateinit var exploreBinding:FragmentExploreBinding
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
        return rootView
    }
}
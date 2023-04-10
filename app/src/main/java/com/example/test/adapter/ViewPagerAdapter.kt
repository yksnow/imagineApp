package com.example.test.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    listFragment: List<Fragment>
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    val listFragment = listFragment
    override fun getItemCount(): Int {
        return listFragment.size;
    }

    override fun createFragment(position: Int): Fragment {
        return listFragment[position];
    }
}

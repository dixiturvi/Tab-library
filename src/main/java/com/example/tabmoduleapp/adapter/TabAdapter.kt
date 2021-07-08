package com.example.tabmoduleapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(
    fragmentManager: FragmentManager,
    var fragments: ArrayList<Fragment>,
    private var titles: ArrayList<String>? = null
) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) = fragments[position]

    override fun getCount() = fragments.size

    override fun getPageTitle(position: Int) =
        if (titles != null && titles!!.isNotEmpty()) titles!![position] else ""
}
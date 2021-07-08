package com.example.tabmoduleapp

import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.tabmoduleapp.adapter.TabAdapter
import com.google.android.material.tabs.TabLayout
import java.util.*


@BindingAdapter("manager", "arrFragment", "arrTitles")
fun setTabAdapter(
    viewPager: ViewPager,
    manager: FragmentManager,
    arrFragment: ArrayList<Fragment>?,
    arrTitles: ArrayList<String>?
) {
    if (arrFragment != null && arrTitles != null && arrFragment.isNotEmpty() && arrTitles.isNotEmpty()) {
        viewPager.adapter = TabAdapter(manager, arrFragment, arrTitles)
    }
}


@BindingAdapter("viewPager")
fun setViewPager(tabLayout: TabLayout, viewPager: ViewPager) {
    tabLayout.setupWithViewPager(viewPager)
}

@BindingAdapter("viewPager", "tabIcon")
fun setViewPager(tabLayout: TabLayout, viewPager: ViewPager, arrIcons: ArrayList<Int>? = null) {
    tabLayout.setupWithViewPager(viewPager)
    if (tabLayout.tabCount > 0 && arrIcons != null) {
        for ((i, icon) in arrIcons.withIndex()) {
            tabLayout.getTabAt(i)!!.icon = ContextCompat.getDrawable(tabLayout.context, icon)
        }
    }
}




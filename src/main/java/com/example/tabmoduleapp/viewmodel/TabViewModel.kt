package com.example.tabmoduleapp.viewmodel

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.tabmoduleapp.getFragments

class TabViewModel(private val activity: Activity) : ViewModel() {

    fun getFragment() : ArrayList<Fragment>{
        return activity.getFragments()
    }

/*
    fun Activity.getFragments(): ArrayList<Fragment> {
        val arrFragments = ArrayList<Fragment>()
        arrFragments.add(ModuleFragmentOne())
        arrFragments.add(ModuleFragmentTwo())
        return arrFragments
    }*/
}
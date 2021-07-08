package com.example.tabmoduleapp

import android.app.Activity
import androidx.fragment.app.Fragment
import com.example.tabmoduleapp.fragments.ModuleFragmentOne
import com.example.tabmoduleapp.fragments.ModuleFragmentTwo


fun Activity.getData(): ArrayList<String> {
    val arrTitles = ArrayList<String>()
    arrTitles.add("Module tab 1")
    arrTitles.add("Module tab 2")
    return arrTitles
}

fun Activity.getFragments(): ArrayList<Fragment> {
    val arrFragments = ArrayList<Fragment>()
    arrFragments.add(ModuleFragmentOne())
    arrFragments.add(ModuleFragmentTwo())
    return arrFragments
}

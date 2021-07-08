package com.example.tabmoduleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tabmoduleapp.databinding.ActivityTabSelectionBinding
import com.example.tabmoduleapp.viewmodel.TabViewModel
import com.google.android.material.tabs.TabLayout

open class TabSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTabSelectionBinding

    private val tabViewModel: TabViewModel by lazy {
        TabViewModel(this@TabSelectionActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tab_selection)
        binding.run {
            lifecycleOwner = this@TabSelectionActivity
            arrTitles = getData()
            manager = supportFragmentManager
            viewModel = tabViewModel
        }


    }
}
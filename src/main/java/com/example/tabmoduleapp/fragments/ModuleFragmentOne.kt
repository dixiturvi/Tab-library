package com.example.tabmoduleapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.tabmoduleapp.R
import com.example.tabmoduleapp.databinding.FragmentModuleOneBinding
import java.util.*


class ModuleFragmentOne : Fragment() {

    private lateinit var binding: FragmentModuleOneBinding
    private var currentQuery = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_module_one,
                container,
                false
            )
        binding.run {
            lifecycleOwner = this@ModuleFragmentOne
        }
        return binding.root
    }


}
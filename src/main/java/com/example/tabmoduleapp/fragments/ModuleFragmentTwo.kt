package com.example.tabmoduleapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.tabmoduleapp.R
import com.example.tabmoduleapp.databinding.FragmentModuleTwoBinding
import java.util.*


class ModuleFragmentTwo : Fragment() {

    private lateinit var binding: FragmentModuleTwoBinding
    private var currentQuery = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_module_two,
                container,
                false
            )
        binding.run {
            lifecycleOwner = this@ModuleFragmentTwo
        }
        return binding.root
    }


}
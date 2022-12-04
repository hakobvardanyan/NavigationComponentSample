package com.hakvardanyan.navigationsample.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentHomeChild2Binding

class HomeFragmentChild2 : BaseFragment<FragmentHomeChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentHomeChild2Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToHomeChild3?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragmentChild2_to_homeFragmentChild3)
        }
    }
}

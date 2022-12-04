package com.hakvardanyan.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentSplashBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToRegister?.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_registerFragment)
        }
    }
}

package com.hakvardanyan.navigationsample

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.databinding.FragmentSplashBinding
import kotlinx.coroutines.delay

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentSplashBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewLifecycleOwner.lifecycleScope.launchWhenResumed {
            val isAuthenticated = requireActivity()
                .getSharedPreferences("auth", Context.MODE_PRIVATE)
                .getBoolean("isAuthenticated", false)

            val destination = if (isAuthenticated)
                R.id.action_splashFragment_to_mainFragment
            else
                R.id.action_splashFragment_to_auth_navigation

            delay(500)
            findNavController().navigate(destination)
        }
    }
}

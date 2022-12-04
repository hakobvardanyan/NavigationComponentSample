package com.hakvardanyan.navigationsample.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentProfileChild2Binding

class ProfileFragmentChild2 : BaseFragment<FragmentProfileChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentProfileChild2Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToProfileChild3?.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragmentChild2_to_profileFragmentChild3)
        }
    }
}

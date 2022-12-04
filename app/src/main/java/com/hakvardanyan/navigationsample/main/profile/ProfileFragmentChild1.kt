package com.hakvardanyan.navigationsample.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentProfileChild1Binding

class ProfileFragmentChild1 : BaseFragment<FragmentProfileChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentProfileChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToProfileChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragmentChild1_to_profileFragmentChild2)
        }
    }
}

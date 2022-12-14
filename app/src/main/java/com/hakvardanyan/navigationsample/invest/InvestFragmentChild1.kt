package com.hakvardanyan.navigationsample.invest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentInvestChild1Binding

class InvestFragmentChild1 : BaseFragment<FragmentInvestChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInvestChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToInvestChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_investFragmentChild1_to_investFragmentChild2)
        }
    }
}

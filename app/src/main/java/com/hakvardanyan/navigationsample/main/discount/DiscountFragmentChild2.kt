package com.hakvardanyan.navigationsample.main.discount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentDiscountChild2Binding

class DiscountFragmentChild2 : BaseFragment<FragmentDiscountChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentDiscountChild2Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToDiscountChild3?.setOnClickListener {
            findNavController().navigate(R.id.action_discountFragmentChild2_to_discountFragmentChild3)
        }
    }
}

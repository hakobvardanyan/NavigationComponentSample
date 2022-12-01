package com.hakvardanyan.navigationsample.home.discount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentDiscountChild1Binding

class DiscountFragmentChild1 : BaseFragment<FragmentDiscountChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentDiscountChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToDiscountChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_discountFragmentChild1_to_discountFragmentChild2)
        }
    }
}

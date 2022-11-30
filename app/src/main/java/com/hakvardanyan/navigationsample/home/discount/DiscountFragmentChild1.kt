package com.hakvardanyan.navigationsample.home.discount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentDiscountChild1Binding

class DiscountFragmentChild1 : Fragment() {

    private var binding: FragmentDiscountChild1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentDiscountChild1Binding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToDiscountChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_discountFragmentChild1_to_discountFragmentChild2)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

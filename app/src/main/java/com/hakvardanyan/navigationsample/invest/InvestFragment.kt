package com.hakvardanyan.navigationsample.invest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentInvestBinding

class InvestFragment : BaseFragment<FragmentInvestBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInvestBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToInvestChild1?.setOnClickListener {
            findNavController().navigate(R.id.action_investFragment_to_investFragmentChild1)
        }
    }
}

package com.hakvardanyan.navigationsample.main.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentCardDetailsBinding

class CardDetailsFragment : BaseFragment<FragmentCardDetailsBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentCardDetailsBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonChangeInfo?.setOnClickListener {
            findNavController().navigate(R.id.action_cardDetailsFragment_to_walletFragmentChild1)
        }
    }
}

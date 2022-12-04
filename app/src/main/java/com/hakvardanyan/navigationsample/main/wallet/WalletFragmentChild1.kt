package com.hakvardanyan.navigationsample.main.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentWalletChild1Binding

class WalletFragmentChild1 : BaseFragment<FragmentWalletChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentWalletChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToWalletChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_walletFragmentChild1_to_walletFragmentChild2)
        }
    }
}

package com.hakvardanyan.navigationsample.main.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentWalletBinding
import com.hakvardanyan.navigationsample.main.home.CoinsAdapter

class WalletFragment : BaseFragment<FragmentWalletBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentWalletBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            cardsPager.adapter = CardsPagerAdapter()
            cardsPager.setPageTransformer(ZoomOutPageTransformer())
            coinsRecyclerView.layoutManager = LinearLayoutManager(context)
            coinsRecyclerView.adapter = CoinsAdapter {
                findNavController().navigate(R.id.action_walletFragment_to_cardDetailsFragment,)
            }
        }
    }
}

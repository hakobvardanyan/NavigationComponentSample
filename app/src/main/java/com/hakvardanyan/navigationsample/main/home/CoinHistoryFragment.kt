package com.hakvardanyan.navigationsample.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentCoinHistoryBinding

class CoinHistoryFragment : BaseFragment<FragmentCoinHistoryBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentCoinHistoryBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val coin = arguments?.getSerializable(KEY_COIN) as? Coin ?: Coin.BITCOIN
            imageCoin.setImageResource(coin.icon)
            coinName.text = coin.title
            coinShortName.text = coin.shortTitle
            buttonMoreInfo.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragmentChild1_to_homeFragmentChild2)
            }
        }
    }
}

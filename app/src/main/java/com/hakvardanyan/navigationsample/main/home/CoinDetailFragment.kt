package com.hakvardanyan.navigationsample.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentCoinDetailBinding

class CoinDetailFragment : BaseFragment<FragmentCoinDetailBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentCoinDetailBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.coinCard?.apply {
            val coin = arguments?.getSerializable(KEY_COIN) as? Coin ?: Coin.BITCOIN
            coinName.text = coin.title
            coinAmount.text = coin.amount
            coinShortName.text = coin.shortTitle
            coinIcon.setImageResource(coin.icon)
            coinChart.setImageResource(coin.chart)
            coinFluctuation.text = coin.fluctuation
            root.setOnClickListener {
                findNavController().navigate(
                    R.id.action_coinDetailFragment_to_homeFragmentChild1,
                    bundleOf(KEY_COIN to coin)
                )
            }
        }
    }
}

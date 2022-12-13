package com.hakvardanyan.navigationsample.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentCoinDetailBinding

class CoinDetailFragment : BaseFragment<FragmentCoinDetailBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentCoinDetailBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val coin = arguments?.getSerializable(KEY_COIN) as? Coin ?: Coin.BITCOIN
            coinCard.coinName.text = coin.title
            coinCard.coinAmount.text = coin.amount
            coinCard.coinShortName.text = coin.shortTitle
            coinCard.coinIcon.setImageResource(coin.icon)
            coinCard.coinChart.setImageResource(coin.chart)
            coinCard.coinFluctuation.text = coin.fluctuation
        }
    }
}

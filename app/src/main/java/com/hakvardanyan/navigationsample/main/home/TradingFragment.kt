package com.hakvardanyan.navigationsample.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentTradingBinding

class TradingFragment : BaseFragment<FragmentTradingBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentTradingBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            coinsRecyclerView.layoutManager = LinearLayoutManager(context)
            coinsRecyclerView.adapter = CoinsAdapter {
                findNavController().navigate(
                    R.id.action_tradingFragment_to_coinDetailFragment,
                    bundleOf(KEY_COIN to it)
                )
            }
        }
    }
}

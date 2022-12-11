package com.hakvardanyan.navigationsample.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentTradingBinding

class TradingFragment : BaseFragment<FragmentTradingBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentTradingBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            coinsRecyclerView.layoutManager = LinearLayoutManager(context)
            coinsRecyclerView.adapter = CoinsAdapter {
                Toast.makeText(context, it.title, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

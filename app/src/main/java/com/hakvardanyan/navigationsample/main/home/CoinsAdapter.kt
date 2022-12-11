package com.hakvardanyan.navigationsample.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.ItemViewCoinBinding
import com.hakvardanyan.navigationsample.main.home.Coin.*

class CoinsAdapter(private val onItemClick: (Coin) -> Unit) : RecyclerView.Adapter<CoinsAdapter.ViewHolder>() {

    private val coins = listOf(
        BITCOIN,
        ETHEREUM,
        BRAND_PROTOCOL,
        CARDANO,
        TRON,
        TETHER,
        DOGECOIN,
        BITCOIN,
        ETHEREUM,
        BRAND_PROTOCOL,
        CARDANO,
        TRON,
        TETHER,
        DOGECOIN,
        BITCOIN,
        ETHEREUM,
        BRAND_PROTOCOL,
        CARDANO,
        TRON,
        TETHER,
        DOGECOIN,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemViewCoinBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(coins[position])
    }

    override fun getItemCount(): Int = coins.size

    inner class ViewHolder(
        private val binding: ItemViewCoinBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private var boundData = BITCOIN

        init {
            itemView.setOnClickListener {
                onItemClick(boundData)
            }
        }

        fun bind(data: Coin) {
            boundData = data
            val color = if (data.fluctuation.first() == '+') R.color.green else R.color.red_dark
            binding.coinFluctuation.setTextColor(ContextCompat.getColor(itemView.context, color))
            binding.coinName.text = data.title
            binding.coinAmount.text = data.amount
            binding.coinShortName.text = data.shortTitle
            binding.coinFluctuation.text = data.fluctuation
            binding.coinIcon.setImageResource(data.icon)
            binding.coinChart.setImageResource(data.chart)
        }
    }
}

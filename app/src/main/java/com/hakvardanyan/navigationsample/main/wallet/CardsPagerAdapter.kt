package com.hakvardanyan.navigationsample.main.wallet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.ItemViewCreditCardBinding

class CardsPagerAdapter : RecyclerView.Adapter<CardsPagerAdapter.ViewHolder>() {

    private val cards = listOf(
        R.drawable.ic_credit_card_1,
        R.drawable.ic_credit_card_2,
        R.drawable.ic_credit_card_3
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemViewCreditCardBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cards[position])
    }

    override fun getItemCount(): Int = cards.size

    inner class ViewHolder(
        private val binding: ItemViewCreditCardBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Int) {
            binding.root.setImageResource(data)
        }
    }
}
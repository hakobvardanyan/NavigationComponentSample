package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hakvardanyan.navigationsample.databinding.ItemViewNotificationBinding
import com.hakvardanyan.navigationsample.main.profile.Notification.*

class NotificationsAdapter(private val onItemClick: (Notification) -> Unit) : RecyclerView.Adapter<NotificationsAdapter.NotificationViewHolder>() {

    private val notifications = listOf(
        TRANSFER,
        INCOME,
        OUTCOME,
        PAYMENT,
        PURCHASE,
        OUTCOME,
        TRANSFER,
        PAYMENT,
        PURCHASE,
        PURCHASE,
        INCOME,
        TRANSFER,
        OUTCOME,
        TRANSFER,
        PAYMENT,
        PURCHASE,
        PURCHASE,
        INCOME,
        TRANSFER
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemViewNotificationBinding.inflate(inflater, parent, false)
        return NotificationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.bind(notifications[position])
    }

    override fun getItemCount() = notifications.size

    inner class NotificationViewHolder(
        private val binding: ItemViewNotificationBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private var boundData = INCOME

        init {
            itemView.setOnClickListener {
                onItemClick(boundData)
            }
        }

        fun bind(data: Notification) {
            boundData = data
            binding.title.text = data.title
            binding.description.text = data.description
            binding.icon.setImageResource(data.drawable)
        }
    }
}

package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.ItemViewNotificationBinding
import com.hakvardanyan.navigationsample.main.profile.NotificationsAdapter.Notification.*

class NotificationsAdapter : RecyclerView.Adapter<NotificationsAdapter.NotificationViewHolder>() {

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

        fun bind(data: Notification) {
            binding.title.text = data.title
            binding.description.text = data.description
            binding.icon.setImageResource(data.drawable)
        }
    }

    enum class Notification(
        val title: String,
        val description: String,
        @DrawableRes val drawable: Int
    ) {
        INCOME("Income", description2, R.drawable.ic_income),
        OUTCOME("Outcome", description1, R.drawable.ic_outcome),
        PAYMENT("Payment", description3, R.drawable.ic_payment),
        TRANSFER("Transfer", description1, R.drawable.ic_money_transfer),
        PURCHASE("Shopping", description2, R.drawable.ic_shopping_cart)
    }

    private companion object {
        const val description1 = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum"
        const val description2 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"
        const val description3 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia"
    }
}

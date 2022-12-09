package com.hakvardanyan.navigationsample.main.profile

import androidx.annotation.DrawableRes
import com.hakvardanyan.navigationsample.R

const val KEY_NOTIFICATION = "arg_notification"
private const val DESCRIPTION1 = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum"
private const val DESCRIPTION2 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"
private const val DESCRIPTION3 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia"

enum class Notification(
    val title: String,
    val description: String,
    @DrawableRes val drawable: Int
) {
    INCOME("Income", DESCRIPTION2, R.drawable.ic_income),
    OUTCOME("Outcome", DESCRIPTION1, R.drawable.ic_outcome),
    PAYMENT("Payment", DESCRIPTION3, R.drawable.ic_payment),
    TRANSFER("Transfer", DESCRIPTION1, R.drawable.ic_money_transfer),
    PURCHASE("Shopping", DESCRIPTION2, R.drawable.ic_shopping_cart)
}

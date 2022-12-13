package com.hakvardanyan.navigationsample.main.home

import androidx.annotation.DrawableRes
import com.hakvardanyan.navigationsample.R

const val KEY_COIN = "arg.key_coin"

enum class Coin(
    val title: String,
    val shortTitle: String,
    @DrawableRes val chart: Int,
    @DrawableRes val icon: Int,
    val amount: String,
    val fluctuation: String
) {
    BITCOIN(
        title = "Bitcoin",
        shortTitle = "BTC",
        chart = R.drawable.ic_chart_up_1,
        icon = R.drawable.ic_bitcoin,
        amount = "$2,509.75",
        fluctuation = "+9.77%"
    ),
    ETHEREUM(
        title = "Ethereum",
        shortTitle = "ETH",
        chart = R.drawable.ic_chart_down_1,
        icon = R.drawable.ic_ethereum,
        amount = "$2,108.24",
        fluctuation = "-21.00%"
    ),
    TETHER(
        title = "Tether",
        shortTitle = "USDT",
        chart = R.drawable.ic_chart_down_2,
        icon = R.drawable.ic_tether,
        amount = "$1,123.02",
        fluctuation = "-38.06%"
    ),
    DOGECOIN(
        title = "Dogecoin",
        shortTitle = "DOGE",
        chart = R.drawable.ic_chart_up_2,
        icon = R.drawable.ic_dogecoin,
        amount = "$923.18",
        fluctuation = "+48.02%"
    ),
    TRON(
        title = "TRON",
        shortTitle = "TRX",
        chart = R.drawable.ic_chart_up_3,
        icon = R.drawable.ic_tron,
        amount = "$521.97",
        fluctuation = "+13.24%"
    ),
    BRAND_PROTOCOL(
        title = "Brand Protocol",
        shortTitle = "BRND",
        chart = R.drawable.ic_chart_down_2,
        icon = R.drawable.ic_brand_protocol,
        amount = "$311.28",
        fluctuation = "-27.24%"
    ),
    CARDANO(
        title = "Cardano",
        shortTitle = "ADA",
        chart = R.drawable.ic_chart_up_1,
        icon = R.drawable.ic_cardano,
        amount = "$1312.22",
        fluctuation = "+22.76%"
    )
}
package com.hakvardanyan.navigationsample

import com.hakvardanyan.navigationsample.home.HomeGraphViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val singleModule = module {
    viewModel {
        HomeGraphViewModel()
    }
}

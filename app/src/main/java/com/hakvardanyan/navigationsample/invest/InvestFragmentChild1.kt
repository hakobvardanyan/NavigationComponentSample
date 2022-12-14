package com.hakvardanyan.navigationsample.invest

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentInvestChild1Binding

class InvestFragmentChild1 : BaseFragment<FragmentInvestChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInvestChild1Binding::inflate

}

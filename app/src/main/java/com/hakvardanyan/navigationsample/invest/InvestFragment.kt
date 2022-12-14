package com.hakvardanyan.navigationsample.invest

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentInvestBinding

class InvestFragment : BaseFragment<FragmentInvestBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInvestBinding::inflate

}

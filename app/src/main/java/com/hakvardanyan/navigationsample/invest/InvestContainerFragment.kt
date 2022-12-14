package com.hakvardanyan.navigationsample.invest

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentInvestContainerBinding

class InvestContainerFragment : BaseFragment<FragmentInvestContainerBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInvestContainerBinding::inflate

}

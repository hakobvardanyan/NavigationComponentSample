package com.hakvardanyan.navigationsample.main.discount

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentDiscountBinding

class DiscountFragment : BaseFragment<FragmentDiscountBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentDiscountBinding::inflate

}

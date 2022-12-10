package com.hakvardanyan.navigationsample.main.home

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentHomeContainerBinding

class HomeContainerFragment : BaseFragment<FragmentHomeContainerBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentHomeContainerBinding::inflate

}

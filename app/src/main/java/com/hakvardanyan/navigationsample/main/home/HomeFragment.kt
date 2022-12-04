package com.hakvardanyan.navigationsample.main.home

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentHomeBinding::inflate

}

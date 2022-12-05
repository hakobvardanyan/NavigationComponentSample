package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentProfileContainerBinding

class ProfileContainerFragment : BaseFragment<FragmentProfileContainerBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentProfileContainerBinding::inflate

}

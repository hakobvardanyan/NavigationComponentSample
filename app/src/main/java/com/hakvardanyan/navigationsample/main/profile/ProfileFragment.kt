package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentProfileBinding::inflate

}

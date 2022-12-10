package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentPrivacyPolicyBinding

class PrivacyPolicyFragment : BaseFragment<FragmentPrivacyPolicyBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentPrivacyPolicyBinding::inflate

}

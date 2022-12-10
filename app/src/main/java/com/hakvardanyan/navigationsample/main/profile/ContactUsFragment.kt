package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentContactUsBinding

class ContactUsFragment : BaseFragment<FragmentContactUsBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentContactUsBinding::inflate

}

package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentTermsConditionsBinding

class TermsConditionsFragment : BaseFragment<FragmentTermsConditionsBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentTermsConditionsBinding::inflate

}

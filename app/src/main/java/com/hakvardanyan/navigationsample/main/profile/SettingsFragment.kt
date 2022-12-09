package com.hakvardanyan.navigationsample.main.profile

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentSettingsBinding

class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentSettingsBinding::inflate

}

package com.hakvardanyan.navigationsample.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentProfileBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            buttonLogout.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_profileFragmentChild2)
            }
            buttonNotifications.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_notificationsFragment)
            }
            buttonSettings.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_settingsFragment)
            }
            buttonTerms.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_termsConditionsFragment)
            }
            buttonPrivacy.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_privacyPolicyFragment)
            }
            buttonContactUs.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_contactUsFragment)
            }
        }
    }
}

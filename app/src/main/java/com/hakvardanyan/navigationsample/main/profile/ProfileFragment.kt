package com.hakvardanyan.navigationsample.main.profile

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.edit
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentProfileBinding
import com.hakvardanyan.navigationsample.ext.findRootNavController

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentProfileBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
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
            buttonLogout.setOnClickListener {
                requireActivity()
                    .getSharedPreferences("auth", Context.MODE_PRIVATE)
                    .edit { clear() }
                findRootNavController().navigate(R.id.auth_navigation, null, navOptions {
                    popUpTo(R.id.app_navigation)
                })
            }
        }
    }
}

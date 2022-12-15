package com.hakvardanyan.navigationsample.auth

import android.content.Context
import android.os.Bundle
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.edit
import androidx.core.text.buildSpannedString
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentRegisterBinding

class RegisterFragment : BaseFragment<FragmentRegisterBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentRegisterBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {

            buttonCreateAccount.setOnClickListener {
                requireActivity()
                    .getSharedPreferences("auth", Context.MODE_PRIVATE)
                    .edit { putBoolean("isAuthenticated", true) }

                findNavController().navigate(R.id.action_registerFragment_to_mainFragment, null, navOptions {
                    anim {
                        enter = R.anim.slide_in_right
                        exit = R.anim.slide_out_left
                        popEnter = R.anim.slide_in_left
                        popExit = R.anim.slide_out_right
                    }
                    popUpTo(R.id.auth_navigation)
                })
            }

            buttonSignIn.setOnClickListener {
                findNavController().popBackStack()
            }

            checkBoxAgreement.text = buildAgreementText()
        }
    }

    private fun buildAgreementText() = buildSpannedString {
        val color = ContextCompat.getColor(requireContext(), R.color.primary_500)
        append(getString(R.string.agreement_part_1))
        append(getString(R.string.agreement_part_2), ForegroundColorSpan(color), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        append(getString(R.string.agreement_part_3))
        append(getString(R.string.agreement_part_4), ForegroundColorSpan(color), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
}

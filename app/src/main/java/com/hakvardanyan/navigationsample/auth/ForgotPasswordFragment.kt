package com.hakvardanyan.navigationsample.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : BaseFragment<FragmentForgotPasswordBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding =
        FragmentForgotPasswordBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }
}

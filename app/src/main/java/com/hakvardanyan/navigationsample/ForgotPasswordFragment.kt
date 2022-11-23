package com.hakvardanyan.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hakvardanyan.navigationsample.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : Fragment() {

    private var binding: FragmentForgotPasswordBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentForgotPasswordBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToRegister?.setOnClickListener {
            findNavController().popBackStack(R.id.registerFragment, false)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

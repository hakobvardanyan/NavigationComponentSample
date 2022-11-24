package com.hakvardanyan.navigationsample.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            buttonNavigateBack.setOnClickListener {
                findNavController().popBackStack()
            }

            buttonNavigateBackToRegister.setOnClickListener {
                findNavController().popBackStack(R.id.registerFragment, false)
            }

            buttonNavigateBackToRoot.setOnClickListener {
                findNavController().popBackStack(R.id.splashFragment, false)
            }

            buttonNavigateToRegister.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_registerFragment)
            }
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}
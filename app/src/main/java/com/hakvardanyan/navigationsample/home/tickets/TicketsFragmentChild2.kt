package com.hakvardanyan.navigationsample.home.tickets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentTicketsChild2Binding

class TicketsFragmentChild2 : BaseFragment<FragmentTicketsChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentTicketsChild2Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToTicketsChild3?.setOnClickListener {
            findNavController().navigate(R.id.action_ticketsFragmentChild2_to_ticketsFragmentChild3)
        }
    }
}

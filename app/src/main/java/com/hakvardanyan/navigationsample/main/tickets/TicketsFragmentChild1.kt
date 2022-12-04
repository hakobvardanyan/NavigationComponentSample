package com.hakvardanyan.navigationsample.main.tickets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentTicketsChild1Binding

class TicketsFragmentChild1 : BaseFragment<FragmentTicketsChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentTicketsChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToTicketsChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_ticketsFragmentChild1_to_ticketsFragmentChild2)
        }
    }
}

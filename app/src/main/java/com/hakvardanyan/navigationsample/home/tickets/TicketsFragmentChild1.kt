package com.hakvardanyan.navigationsample.home.tickets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentTicketsChild1Binding

class TicketsFragmentChild1 : Fragment() {

    private var binding: FragmentTicketsChild1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentTicketsChild1Binding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToTicketsChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_ticketsFragmentChild1_to_ticketsFragmentChild2)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

package com.hakvardanyan.navigationsample.home.outbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentOutboxChild1Binding

class OutboxFragmentChild1 : Fragment() {

    private var binding: FragmentOutboxChild1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentOutboxChild1Binding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToOutboxChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_outboxFragmentChild1_to_outboxFragmentChild2)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

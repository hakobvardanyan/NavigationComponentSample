package com.hakvardanyan.navigationsample.main.outbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentOutboxChild1Binding

class OutboxFragmentChild1 : BaseFragment<FragmentOutboxChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentOutboxChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToOutboxChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_outboxFragmentChild1_to_outboxFragmentChild2)
        }
    }
}

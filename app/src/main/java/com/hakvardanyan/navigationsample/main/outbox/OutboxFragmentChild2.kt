package com.hakvardanyan.navigationsample.main.outbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentOutboxChild2Binding

class OutboxFragmentChild2 : BaseFragment<FragmentOutboxChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentOutboxChild2Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToOutboxChild3?.setOnClickListener {
            findNavController().navigate(R.id.action_outboxFragmentChild2_to_outboxFragmentChild3)
        }
    }
}

package com.hakvardanyan.navigationsample.main.inbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentInboxChild2Binding

class InboxFragmentChild2 : BaseFragment<FragmentInboxChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInboxChild2Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToInboxChild3?.setOnClickListener {
            findNavController().navigate(R.id.action_inboxFragmentChild2_to_inboxFragmentChild3)
        }
    }
}

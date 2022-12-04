package com.hakvardanyan.navigationsample.main.inbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentInboxChild1Binding

class InboxFragmentChild1 : BaseFragment<FragmentInboxChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInboxChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToInboxChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_inboxFragmentChild1_to_inboxFragmentChild2)
        }
    }
}

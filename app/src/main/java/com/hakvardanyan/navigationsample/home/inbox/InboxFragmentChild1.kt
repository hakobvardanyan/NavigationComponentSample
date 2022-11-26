package com.hakvardanyan.navigationsample.home.inbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentInboxChild1Binding

class InboxFragmentChild1 : Fragment() {

    private var binding: FragmentInboxChild1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentInboxChild1Binding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToInboxChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_inboxFragmentChild1_to_inboxFragmentChild2)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

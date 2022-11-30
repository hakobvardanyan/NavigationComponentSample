package com.hakvardanyan.navigationsample.home.inbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hakvardanyan.navigationsample.databinding.FragmentInboxBinding

class InboxFragment : Fragment() {

    private var binding: FragmentInboxBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentInboxBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

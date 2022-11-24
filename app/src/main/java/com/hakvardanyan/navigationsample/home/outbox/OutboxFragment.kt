package com.hakvardanyan.navigationsample.home.outbox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentOutboxBinding

class OutboxFragment : Fragment() {

    private var binding: FragmentOutboxBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentOutboxBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

package com.hakvardanyan.navigationsample.home.tickets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hakvardanyan.navigationsample.databinding.FragmentTicketsBinding

class TicketsFragment : Fragment() {

    private var binding: FragmentTicketsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentTicketsBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

package com.hakvardanyan.navigationsample.home.discount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hakvardanyan.navigationsample.databinding.FragmentDiscountBinding

class DiscountFragment : Fragment() {

    private var binding: FragmentDiscountBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentDiscountBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

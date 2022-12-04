package com.hakvardanyan.navigationsample.main.analysis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentAnalysisChild1Binding

class AnalysisFragmentChild1 : BaseFragment<FragmentAnalysisChild1Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentAnalysisChild1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToAnalysisChild2?.setOnClickListener {
            findNavController().navigate(R.id.action_analysisFragmentChild1_to_analysisFragmentChild2)
        }
    }
}
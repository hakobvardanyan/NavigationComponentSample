package com.hakvardanyan.navigationsample.main.analysis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentAnalysisChild2Binding

class AnalysisFragmentChild2 : BaseFragment<FragmentAnalysisChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentAnalysisChild2Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonNavigateToAnalysisChild3?.setOnClickListener {
            findNavController().navigate(R.id.action_analysisFragmentChild2_to_analysisFragmentChild3)
        }
    }
}

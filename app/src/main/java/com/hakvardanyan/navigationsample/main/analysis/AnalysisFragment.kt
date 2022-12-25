package com.hakvardanyan.navigationsample.main.analysis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentAnalysisBinding

class AnalysisFragment : BaseFragment<FragmentAnalysisBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentAnalysisBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonWeeklyReport?.setOnClickListener {
            findNavController().navigate(R.id.action_analysisFragment_to_weeklyAnalysisFragment)
        }
    }
}

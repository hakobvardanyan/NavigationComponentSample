package com.hakvardanyan.navigationsample.main.analysis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentWeeklyAnalysisBinding

class WeeklyAnalysisFragment : BaseFragment<FragmentWeeklyAnalysisBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentWeeklyAnalysisBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonReport?.setOnClickListener {
            findNavController().navigate(R.id.action_weeklyAnalysisFragment_to_successReportFragment)
        }
    }
}

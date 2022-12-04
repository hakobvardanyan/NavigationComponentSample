package com.hakvardanyan.navigationsample.main.analysis

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentAnalysisBinding

class AnalysisFragment : BaseFragment<FragmentAnalysisBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentAnalysisBinding::inflate

}

package com.hakvardanyan.navigationsample.main.analysis

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentAnalysisContainerBinding

class AnalysisContainerFragment : BaseFragment<FragmentAnalysisContainerBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentAnalysisContainerBinding::inflate

}

package com.hakvardanyan.navigationsample.main.analysis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentSuccessReportBinding

class SuccessReportFragment : BaseFragment<FragmentSuccessReportBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentSuccessReportBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            animationView.postDelayed({
                animationView.playAnimation()
            }, 700)
            buttonClose.setOnClickListener {
                findNavController().run {
                    popBackStack(graph.findStartDestination().id, false)
                }
            }
        }
    }
}

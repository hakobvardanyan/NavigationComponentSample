package com.hakvardanyan.navigationsample.home.outbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentOutboxBinding

class OutboxFragment : BaseFragment<FragmentOutboxBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentOutboxBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val navController =
                nestedOutboxNavigationHost.getFragment<NavHostFragment>().navController
            activity?.onBackPressedDispatcher?.addCallback(
                viewLifecycleOwner,
                object : OnBackPressedCallback(true) {
                    override fun handleOnBackPressed() {
                        navController.popBackStack(navController.graph.findStartDestination().id, false)
                        // TODO: Figure out navigation up functionality, toolbar back button in nested fragment
                        isEnabled = false
                    }
                })
        }

    }
}

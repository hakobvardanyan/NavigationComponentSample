package com.hakvardanyan.navigationsample.home.outbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.fragment.NavHostFragment
import com.hakvardanyan.navigationsample.databinding.FragmentOutboxBinding

class OutboxFragment : Fragment() {

    private var binding: FragmentOutboxBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentOutboxBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

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

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

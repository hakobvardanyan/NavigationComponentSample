package com.hakvardanyan.navigationsample.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.navOptions
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    private fun navigateTo(destinationId: Int, navController: NavController) {
        navController.navigate(destinationId, null, navOptions {
            launchSingleTop = true
            restoreState = true
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
        })
    }

    /**
     * Try to implement this - navController.setOnBackPressedDispatcher(OnBackPressedDispatcher())
     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val navController = nestedHomeNavigationHost.getFragment<NavHostFragment>().navController

            inboxItem.setOnClickListener {
                navigateTo(R.id.inboxFragment, navController)
            }
            outboxItem.setOnClickListener {
                navigateTo(R.id.outboxFragment, navController)
            }
            airplaneTicketItem.setOnClickListener {
                navigateTo(R.id.ticketsFragment, navController)
            }
            discountItem.setOnClickListener {
                navigateTo(R.id.discountFragment, navController)
            }

            addDestinationChangeListener(navController)
            addOnBackPressedCallback(navController)
        }
    }

    private fun addOnBackPressedCallback(navController: NavController) {
        activity?.onBackPressedDispatcher?.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(false) {
                override fun handleOnBackPressed() {
                    navController.run {
                        val startDestinationId = graph.findStartDestination().id
                        isEnabled = currentBackStackEntry?.destination?.id != startDestinationId
                        if (isEnabled) {
                            popBackStack(startDestinationId, false)
                        }
                    }
                }
            })
    }

    private fun addDestinationChangeListener(navController: NavController) {
        navController.addOnDestinationChangedListener(
            object : NavController.OnDestinationChangedListener {
                override fun onDestinationChanged(
                    controller: NavController,
                    destination: NavDestination,
                    arguments: Bundle?
                ) {
                    if (binding?.bottomNavigationView == null) {
                        navController.removeOnDestinationChangedListener(this)
                        return
                    }

                    // TODO: Highlight correct bottom nav item
                    destination.hierarchy.forEach {
                        when (it.id) {
                            R.id.inboxFragment -> Log.d("::::: ", "Inbox")
                            R.id.outboxFragment -> Log.d("::::: ", "Outbox")
                            R.id.ticketsFragment -> Log.d("::::: ", "Tickets")
                            R.id.discountFragment -> Log.d("::::: ", "Discount")
                        }
                    }
                }
            })
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

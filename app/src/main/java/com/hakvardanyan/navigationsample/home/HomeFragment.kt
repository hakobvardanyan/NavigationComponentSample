package com.hakvardanyan.navigationsample.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
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


    private fun doOnClick(menuItemId: Int, navController: NavController) {
        navController.navigate(menuItemId, null, navOptions {
            launchSingleTop = true
            restoreState = true
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val navController = nestedHomeNavigationHost.getFragment<NavHostFragment>().navController

            inboxItem.setOnClickListener {
                doOnClick(R.id.inbox_navigation, navController)
            }
            outboxItem.setOnClickListener {
                doOnClick(R.id.outbox_navigation, navController)
            }
            airplaneTicketItem.setOnClickListener {
                doOnClick(R.id.tickets_navigation, navController)
            }
            discountItem.setOnClickListener {
                doOnClick(R.id.discount_navigation, navController)
            }

            addDestinationChangeListener(navController)
        }
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
    //                        v.menu.forEach { item ->
    //                            if (destination.hierarchy.any { it.id == item.itemId }) {
    //                                item.isChecked = true
    //                            }
    //                        }
                }
            })
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

package com.hakvardanyan.navigationsample.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentHomeBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentHomeBinding::inflate

    private val homeGraphViewModel: HomeGraphViewModel by viewModel(ownerProducer = {
        findNavController().getBackStackEntry(R.id.homeFragment)
    })

    private val iconHomeActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_home_filled) }
    private val iconWalletActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_wallet_filled) }
    private val iconAnalysisActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_analysis_filled) }
    private val iconProfileActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_profile_filled) }

    private val iconHomeInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_home) }
    private val iconWalletInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_wallet) }
    private val iconAnalysisInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_analysis) }
    private val iconProfileInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_profile) }

    /**
     * Try to implement this - navController.setOnBackPressedDispatcher(OnBackPressedDispatcher())
     * By second time clicking on menu item it must pop to nested start destination
     * implement Toolbar back button functionality
     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        homeGraphViewModel.testValue
            .flowWithLifecycle(viewLifecycleOwner.lifecycle)
            .onEach { Log.d(":::::: ", it) }
            .launchIn(viewLifecycleOwner.lifecycleScope)

        binding?.apply {
            val navController = nestedHomeNavigationHost.getFragment<NavHostFragment>().navController

            homeItem.setOnClickListener {
                navigateTo(R.id.inboxFragment, navController)
            }
            walletItem.setOnClickListener {
                navigateTo(R.id.outboxFragment, navController)
            }
            analysisItem.setOnClickListener {
                navigateTo(R.id.ticketsFragment, navController)
            }
            profileItem.setOnClickListener {
                navigateTo(R.id.discountFragment, navController)
            }

            addDestinationChangeListener(navController)
            addOnBackPressedCallback(navController)
        }
    }

    private fun navigateTo(destinationId: Int, navController: NavController) {
        val shouldSaveAndRestoreState = navController.currentDestination?.id != destinationId
        navController.navigate(destinationId, null, navOptions {
            launchSingleTop = true
            restoreState = shouldSaveAndRestoreState
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = shouldSaveAndRestoreState
            }
        })
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
                    binding?.apply {
                        homeItem.setImageDrawable(iconHomeInactive)
                        walletItem.setImageDrawable(iconWalletInactive)
                        analysisItem.setImageDrawable(iconAnalysisInactive)
                        profileItem.setImageDrawable(iconProfileInactive)

                        destination.hierarchy.forEach {
                            when (it.id) {
                                R.id.inboxFragment -> homeItem.setImageDrawable(iconHomeActive)
                                R.id.outboxFragment -> walletItem.setImageDrawable(iconWalletActive)
                                R.id.ticketsFragment -> analysisItem.setImageDrawable(iconAnalysisActive)
                                R.id.discountFragment -> profileItem.setImageDrawable(iconProfileActive)
                            }
                        }
                    } ?: navController.removeOnDestinationChangedListener(this)
                }
            })
    }
}

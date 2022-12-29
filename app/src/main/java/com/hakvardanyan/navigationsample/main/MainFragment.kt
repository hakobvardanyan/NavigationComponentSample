package com.hakvardanyan.navigationsample.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
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
import com.hakvardanyan.navigationsample.databinding.FragmentMainBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentMainBinding::inflate

    private val mainGraphViewModel: MainGraphViewModel by viewModel(ownerProducer = {
        findNavController().getBackStackEntry(R.id.mainFragment)
    })

    private val iconHomeActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_home_filled) }
    private val iconWalletActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_wallet_filled) }
    private val iconProfileActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_profile_filled) }
    private val iconAnalysisActive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_analysis_filled) }

    private val iconHomeInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_home) }
    private val iconWalletInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_wallet) }
    private val iconProfileInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_profile) }
    private val iconAnalysisInactive by lazy { ContextCompat.getDrawable(requireContext(), R.drawable.ic_analysis) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val navController = nestedMainNavigationHost.getFragment<NavHostFragment>().navController

            homeItem.setOnClickListener {
                onBottomMenuItemClick(R.id.homeContainerFragment, navController)
            }
            walletItem.setOnClickListener {
                onBottomMenuItemClick(R.id.walletContainerFragment, navController)
            }
            analysisItem.setOnClickListener {
                onBottomMenuItemClick(R.id.analysisContainerFragment, navController)
            }
            profileItem.setOnClickListener {
                onBottomMenuItemClick(R.id.profileContainerFragment, navController)
            }

            buttonBack.setOnClickListener {
                mainGraphViewModel.submitToolbarBackEvent()
            }

            mainGraphViewModel.showToolbarBackButton
                .flowWithLifecycle(viewLifecycleOwner.lifecycle)
                .onEach { buttonBack.isVisible = it }
                .launchIn(viewLifecycleOwner.lifecycleScope)

            mainGraphViewModel.toolbarTitle
                .flowWithLifecycle(viewLifecycleOwner.lifecycle)
                .onEach { toolbarTitle.text = getString(it) }
                .launchIn(viewLifecycleOwner.lifecycleScope)

            addDestinationChangeListener(navController)
            addOnBackPressedCallback(navController)
        }
    }

    /**
     * Check the branch "multiple-back-stack-support-by-xml-actions"
     * too see the implementation using <action/>
     */
    private fun navigateTo(destinationId: Int, navController: NavController) {
        navController.navigate(destinationId, null, navOptions {
            launchSingleTop = true
            restoreState = true
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
        })
    }

    private fun onBottomMenuItemClick(destinationId: Int, navController: NavController) {
        if (navController.currentDestination?.id == destinationId) {
            mainGraphViewModel.submitBackToGraphRootEvent()
        } else {
            navigateTo(destinationId, navController)
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
                    binding?.apply {
                        homeItem.setImageDrawable(iconHomeInactive)
                        walletItem.setImageDrawable(iconWalletInactive)
                        profileItem.setImageDrawable(iconProfileInactive)
                        analysisItem.setImageDrawable(iconAnalysisInactive)

                        destination.hierarchy.forEach {
                            when (it.id) {
                                R.id.homeContainerFragment -> homeItem.setImageDrawable(iconHomeActive)
                                R.id.walletContainerFragment -> walletItem.setImageDrawable(iconWalletActive)
                                R.id.profileContainerFragment -> profileItem.setImageDrawable(iconProfileActive)
                                R.id.analysisContainerFragment -> analysisItem.setImageDrawable(iconAnalysisActive)
                            }
                        }
                    } ?: navController.removeOnDestinationChangedListener(this)
                }
            })
    }
}

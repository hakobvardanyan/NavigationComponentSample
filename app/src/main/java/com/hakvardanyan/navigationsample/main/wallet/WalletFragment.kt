package com.hakvardanyan.navigationsample.main.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentWalletBinding
import com.hakvardanyan.navigationsample.main.MainGraphViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.random.Random

class WalletFragment : BaseFragment<FragmentWalletBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentWalletBinding::inflate

    private val mainGraphViewModel: MainGraphViewModel by viewModel(ownerProducer = {
        requireActivity().findNavController(R.id.app_nav_host_container).getBackStackEntry(R.id.mainFragment)
//        findHomeFragment(parentFragment) ?: this
    })

    private val onBackPressedCallback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            val navController =
                requireNotNull(binding).nestedWalletNavigationHost.getFragment<NavHostFragment>().navController
            navController.popBackStack(navController.graph.findStartDestination().id, false)
        }
    }

//    private fun findHomeFragment(currentFragment: Fragment?): HomeFragment? =
//        if (currentFragment is HomeFragment) {
//            currentFragment
//        } else {
//            findHomeFragment(currentFragment?.parentFragment)
//        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val navController =
                nestedWalletNavigationHost.getFragment<NavHostFragment>().navController
            activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, onBackPressedCallback)
            addDestinationChangeListener(navController)

            sampleText.setOnClickListener {
                mainGraphViewModel.submitValue(Random.nextDouble().toString())
            }
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
                    if (binding == null) {
                        controller.removeOnDestinationChangedListener(this)
                        return
                    }

                    destination.hierarchy.forEach {
                        when (it.id) {
                            controller.graph.findStartDestination().id -> onBackPressedCallback.isEnabled = false
                            controller.graph.id -> Unit
                            else -> onBackPressedCallback.isEnabled = true
                        }
                    }
                }
            })
    }
}

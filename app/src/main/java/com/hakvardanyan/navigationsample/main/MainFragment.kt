package com.hakvardanyan.navigationsample.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    private val appBarConfiguration: AppBarConfiguration = AppBarConfiguration(
        setOf(
            R.id.home_navigation,
            R.id.wallet_navigation,
            R.id.analysis_navigation,
            R.id.profile_navigation
        )
    )

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentMainBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val controller = nestedMainNavigationHost.getFragment<NavHostFragment>().navController
            bottomNavView.setupWithNavController(controller)
            NavigationUI.setupActionBarWithNavController(
                activity as AppCompatActivity,
                controller,
                appBarConfiguration
            )
        }
    }
}

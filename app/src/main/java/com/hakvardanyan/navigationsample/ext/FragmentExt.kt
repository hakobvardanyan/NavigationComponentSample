package com.hakvardanyan.navigationsample.ext

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.hakvardanyan.navigationsample.R

fun Fragment.findRootNavController(): NavController =
    requireActivity().findNavController(R.id.app_nav_host_container)

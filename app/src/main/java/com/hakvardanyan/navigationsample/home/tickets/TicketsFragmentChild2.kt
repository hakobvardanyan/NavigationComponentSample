package com.hakvardanyan.navigationsample.home.tickets

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentTicketsChild2Binding

class TicketsFragmentChild2 : BaseFragment<FragmentTicketsChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentTicketsChild2Binding::inflate

}

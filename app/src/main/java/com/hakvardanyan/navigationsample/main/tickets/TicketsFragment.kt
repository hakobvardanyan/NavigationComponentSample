package com.hakvardanyan.navigationsample.main.tickets

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentTicketsBinding

class TicketsFragment : BaseFragment<FragmentTicketsBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentTicketsBinding::inflate

}

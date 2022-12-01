package com.hakvardanyan.navigationsample.home.outbox

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentOutboxChild2Binding

class OutboxFragmentChild2 : BaseFragment<FragmentOutboxChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentOutboxChild2Binding::inflate

}

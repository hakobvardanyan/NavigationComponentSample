package com.hakvardanyan.navigationsample.home.inbox

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentInboxChild2Binding

class InboxFragmentChild2 : BaseFragment<FragmentInboxChild2Binding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInboxChild2Binding::inflate

}

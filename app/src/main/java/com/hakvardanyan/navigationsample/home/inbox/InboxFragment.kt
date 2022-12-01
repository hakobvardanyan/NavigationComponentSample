package com.hakvardanyan.navigationsample.home.inbox

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentInboxBinding

class InboxFragment : BaseFragment<FragmentInboxBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentInboxBinding::inflate

}

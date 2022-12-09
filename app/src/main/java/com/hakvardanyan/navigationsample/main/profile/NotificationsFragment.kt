package com.hakvardanyan.navigationsample.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentNotificationsBinding

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentNotificationsBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            notificationsList.layoutManager = LinearLayoutManager(context)
            notificationsList.adapter = NotificationsAdapter {
                findNavController().navigate(
                    R.id.action_notificationsFragment_to_notificationDetailsFragment,
                    bundleOf(KEY_NOTIFICATION to it)
                )
            }
        }
    }
}

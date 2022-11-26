package com.hakvardanyan.navigationsample.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding?.apply {
            val navController = nestedHomeNavigationHost.getFragment<NavHostFragment>().navController
            inboxItem.setOnClickListener {
                navController.navigate(R.id.inboxFragment)
            }
            outboxItem.setOnClickListener {
                navController.navigate(R.id.outboxFragment)
            }
            airplaneTicketItem.setOnClickListener {
                navController.navigate(R.id.ticketsFragment)
            }
            discountItem.setOnClickListener {
                navController.navigate(R.id.discountFragment)
            }
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

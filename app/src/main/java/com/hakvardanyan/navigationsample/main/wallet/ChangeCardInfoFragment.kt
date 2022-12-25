package com.hakvardanyan.navigationsample.main.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.R
import com.hakvardanyan.navigationsample.databinding.FragmentChangeCardInfoBinding

class ChangeCardInfoFragment : BaseFragment<FragmentChangeCardInfoBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentChangeCardInfoBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonSave?.setOnClickListener {
            findNavController().navigate(R.id.action_changeCardInfoFragment_to_saveSuccessFragment)
        }
    }
}

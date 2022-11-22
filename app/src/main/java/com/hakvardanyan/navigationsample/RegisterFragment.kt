package com.hakvardanyan.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hakvardanyan.navigationsample.databinding.FragmentRegisterBinding
import kotlin.random.Random

class RegisterFragment : Fragment() {

    private var binding: FragmentRegisterBinding? = null
    private val randomInt = Random.nextInt(100)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) = FragmentRegisterBinding.inflate(inflater, container, false).run {
        binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {

            val name = arguments?.getString("key.name")
            val age = arguments?.getInt("key.age")
            description.text = name?.plus(" $age")

            buttonNavigateToLogin.setOnClickListener {
                findNavController().navigate(R.id.loginFragment)
            }
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}

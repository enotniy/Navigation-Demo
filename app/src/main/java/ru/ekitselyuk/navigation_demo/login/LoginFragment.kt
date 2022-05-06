package ru.ekitselyuk.navigation_demo.login

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.ekitselyuk.navigation_demo.R
import ru.ekitselyuk.navigation_demo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        val preferences = requireActivity().getPreferences(Context.MODE_PRIVATE);
        with(binding.loginToggle) {
            isChecked = preferences.getBoolean("IS_LOGIN", false)
            setOnCheckedChangeListener { _, b ->
                preferences.edit().putBoolean("IS_LOGIN", b).apply()
            }
        }
        binding.toChat.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_chatGraph)
            requireActivity().finish()
        }
        binding.toCreateUser.setOnClickListener { findNavController().navigate(R.id.action_loginFragment_to_createUser) }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
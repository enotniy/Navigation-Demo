package ru.ekitselyuk.navigation_demo.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.ekitselyuk.navigation_demo.databinding.FragmentCreateUserBinding
import ru.ekitselyuk.navigation_demo.databinding.FragmentHomeBinding
import ru.ekitselyuk.navigation_demo.databinding.FragmentLoginBinding

class CreateUserFragment : Fragment() {

    private var _binding: FragmentCreateUserBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreateUserBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
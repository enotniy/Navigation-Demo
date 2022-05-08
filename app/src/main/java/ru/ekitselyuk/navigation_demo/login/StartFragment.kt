package ru.ekitselyuk.navigation_demo.login

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.ekitselyuk.navigation_demo.R
import ru.ekitselyuk.navigation_demo.addButton
import ru.ekitselyuk.navigation_demo.databinding.FragmentDefaultBinding
import ru.ekitselyuk.navigation_demo.databinding.FragmentLoginBinding

class StartFragment : Fragment() {

    private var _binding: FragmentDefaultBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDefaultBinding.inflate(inflater, container, false)
        val navigation = findNavController()

        binding.container.apply {
            addButton("TO SIGNIN") {
                navigation.navigate(R.id.action_startFragment_to_signinFragment)
            }

            addButton("TO SIGNUP NICKNAME") {
                navigation.navigate(R.id.action_startFragment_to_signupNicknameFragment)
            }

            addButton("TO CHAT") {
                navigation.navigate(R.id.action_startFragment_to_applicationActivity)
                requireActivity().finish()
            }
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
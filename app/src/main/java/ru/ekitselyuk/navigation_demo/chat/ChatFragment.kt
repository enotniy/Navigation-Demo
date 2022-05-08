package ru.ekitselyuk.navigation_demo.chat

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

class ChatFragment : Fragment() {

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
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
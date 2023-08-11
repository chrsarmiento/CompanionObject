package com.desafiolatam.companionobject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.desafiolatam.companionobject.constant.COMPANION_OBJECT_NUMBER
import com.desafiolatam.companionobject.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Tu código aquí
        arguments?.getInt(COMPANION_OBJECT_NUMBER)?.let { number ->
            binding.tvTitle.text = number.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(number: Int) = MainFragment().apply {
            arguments = Bundle().apply {
                putInt(COMPANION_OBJECT_NUMBER, number)
            }
        }
    }
}
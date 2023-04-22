package com.example.finalpy.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.finalpy.databinding.FragmentDiceBinding


class DiceFragment : Fragment() {
    private var _binding: FragmentDiceBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DiceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDiceBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRamdomValue()
    }

    private fun setRamdomValue() {
        binding.btnSetValue.setOnClickListener {
            viewModel.generateDiceValue()
        }
        viewModel.diceValue.observe(requireActivity()) { value ->

            binding.diceValueText.text = value.toString()

        }
    }

}
package com.example.mvvmlesson3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.mvvmlesson3.R
import com.example.mvvmlesson3.ViewModel.CounterViewModel
import com.example.mvvmlesson3.databinding.FragmentButtonsBinding
import kotlinx.coroutines.flow.combineTransform


class ButtonsFragment : Fragment() {
private lateinit var binding:FragmentButtonsBinding
private lateinit var viewModel: CounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(layoutInflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]

        binding.btnClickPlus.setOnClickListener {
            viewModel.plusCount()
        }
        binding.btnClickMinus.setOnClickListener {
            viewModel.minusCount()
        }
    }


}
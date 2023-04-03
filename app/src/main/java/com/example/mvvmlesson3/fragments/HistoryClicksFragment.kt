package com.example.mvvmlesson3.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmlesson3.R
import com.example.mvvmlesson3.ViewModel.CounterViewModel
import com.example.mvvmlesson3.databinding.FragmentHistoryClicksBinding
import com.example.mvvmlesson3.fragments.adapter.HistoryListAdapter

class HistoryClicksFragment : Fragment() {
private lateinit var binding:FragmentHistoryClicksBinding
private var viewModel:CounterViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryClicksBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
              viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]
              viewModel!!.operation.observe(viewLifecycleOwner, Observer {
              binding.tvHistory.text = it.toString()
     })

    }
}
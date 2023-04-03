package com.example.mvvmlesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.mvvmlesson3.ViewModel.CounterViewModel
import com.example.mvvmlesson3.databinding.ActivityMainBinding
import com.example.mvvmlesson3.fragments.ButtonsFragment
import com.example.mvvmlesson3.fragments.HistoryClicksFragment
import com.example.mvvmlesson3.fragments.NumberClicksFragment
import com.example.mvvmlesson3.fragments.adapter.PagerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: PagerAdapter
    private lateinit var counterViewModel: CounterViewModel

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialization()
    }

    private fun initialization() {
      pagerAdapter = PagerAdapter(this)
      binding.vpMvvm.adapter = pagerAdapter


    }
}
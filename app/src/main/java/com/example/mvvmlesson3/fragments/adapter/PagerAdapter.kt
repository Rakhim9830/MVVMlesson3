package com.example.mvvmlesson3.fragments.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mvvmlesson3.fragments.ButtonsFragment
import com.example.mvvmlesson3.fragments.HistoryClicksFragment
import com.example.mvvmlesson3.fragments.NumberClicksFragment

class PagerAdapter(manager:FragmentActivity): FragmentStateAdapter(manager) {
    private val fragments = listOf(ButtonsFragment(), HistoryClicksFragment(), NumberClicksFragment())
    val points = 3
    override fun getItemCount(): Int {
    return  points
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> {ButtonsFragment()}
            1->{NumberClicksFragment()}
            2->{HistoryClicksFragment()}
            else->{ButtonsFragment()}
        }
    }
}
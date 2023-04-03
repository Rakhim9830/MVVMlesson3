package com.example.mvvmlesson3.fragments.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.mvvmlesson3.R

@Suppress("UNREACHABLE_CODE")
class HistoryListAdapter(context:Context, private val historyList:List<String>): ArrayAdapter<String>(context,0,historyList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
        val view = convertView
        if (view == null){
            view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        }
        val operation = historyList[position]
        val operationTv = view?.findViewById<TextView>(R.id.tv_history)
        operationTv?.text ?: operation
    }
}
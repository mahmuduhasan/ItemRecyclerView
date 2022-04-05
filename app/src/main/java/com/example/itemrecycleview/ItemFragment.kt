package com.example.itemrecycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.itemrecycleview.databinding.FragmentItemBinding

class ItemFragment : Fragment() {
    private lateinit var binding : FragmentItemBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemBinding.inflate(inflater,container,false)
        val adapter = ItemAdapter()
        binding.itemRecycleVIew.layoutManager = LinearLayoutManager(activity)
        binding.itemRecycleVIew.adapter = adapter
        adapter.submitList(itemList)
        return binding.root
    }
}
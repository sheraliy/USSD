package com.example.ussdm.fragments.menu_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdm.R
import com.example.ussdm.activity.MainActivity
import com.example.ussdm.adapter.MyRecyclerAdapter
import com.example.ussdm.databinding.FragmentMBBinding
import com.example.ussdm.model.RecModel


class MBFragment : Fragment() {

    private lateinit var binding: FragmentMBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentMBBinding.inflate(layoutInflater, container, false)
        val mainActivity = activity as MainActivity
        mainActivity.supportActionBar?.elevation = 0F
        mainActivity.supportActionBar?.title = "Internet paketlar"

        binding.rv.adapter = MyRecyclerAdapter(requireContext(), initList()){
        }
        return binding.root
    }

    private fun initList(): List<RecModel> {
        return listOf(
            RecModel("50", "50 MB", getString(R.string.desc_50)),
            RecModel("100", "100 MB", getString(R.string.desc_50)),
            RecModel("150", "150 MB", getString(R.string.desc_50)),
            RecModel("500", "500 MB", getString(R.string.desc_50)),
            RecModel("2 GB", "2 GB", getString(R.string.desc_50))
        )
    }
}
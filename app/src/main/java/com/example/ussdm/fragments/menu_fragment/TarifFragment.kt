package com.example.ussdm.fragments.menu_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdm.R
import com.example.ussdm.activity.MainActivity
import com.example.ussdm.adapter.MyRecAdapter2
import com.example.ussdm.adapter.MyRecyclerAdapter
import com.example.ussdm.databinding.FragmentTarifBinding
import com.example.ussdm.model.RecModel


class TarifFragment : Fragment() {

    private lateinit var binding: FragmentTarifBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTarifBinding.inflate(inflater, container, false)

        val mainActivity = activity as MainActivity
        mainActivity.supportActionBar?.elevation = 0F
        mainActivity.supportActionBar?.title = "Tariflar"
        binding.rv.adapter = MyRecAdapter2(requireContext(), initList()){

        }
        return binding.root
    }
    private fun initList(): List<RecModel> {
        return listOf(
            RecModel("*102#", "Oddiy 10", getString(R.string.desc_50)),
            RecModel("*104#", "Delovoy", getString(R.string.desc_50)),
            RecModel("*144#", "Komfort", getString(R.string.desc_50)),
            RecModel("*141#", "Bolajon", getString(R.string.desc_50)),
            RecModel("*411#", "Yoshlar", getString(R.string.desc_50)),
            RecModel("*535#", "Traffic", getString(R.string.desc_50)),
            RecModel("*111#", "Traffic2", getString(R.string.desc_50))
        )
    }
}
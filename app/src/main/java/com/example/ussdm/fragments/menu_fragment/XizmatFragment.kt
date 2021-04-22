package com.example.ussdm.fragments.menu_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdm.R
import com.example.ussdm.activity.MainActivity
import com.example.ussdm.adapter.MyRecAdapter2
import com.example.ussdm.databinding.FragmentXizmatBinding
import com.example.ussdm.model.RecModel


class XizmatFragment : Fragment() {

    private lateinit var binding: FragmentXizmatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXizmatBinding.inflate(inflater, container, false)
        val mainActivity = activity as MainActivity
        mainActivity.supportActionBar?.elevation = 0F
        mainActivity.supportActionBar?.title = "Xizmatlar"
        binding.rv.adapter = MyRecAdapter2(requireContext(), initList()){

        }
        return binding.root
    }
    private fun initList(): List<RecModel> {
        return listOf(
            RecModel("*102#", "Lite 4G", getString(R.string.desc_50)),
            RecModel("*104#", "Men kimman", getString(R.string.desc_50)),
            RecModel("*144#", "Menga qo`ng`iroq qiling", getString(R.string.desc_50)),
            RecModel("*141#", "Hisobni to`ldirish", getString(R.string.desc_50)),
            RecModel("*411#", "Mobil anons", getString(R.string.desc_50)),
            RecModel("*535#", "Play mobile", getString(R.string.desc_50)),
            RecModel("*111#", "Ovozli pochta", getString(R.string.desc_50))
        )
    }
}
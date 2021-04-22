package com.example.ussdm.fragments.menu_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdm.R
import com.example.ussdm.activity.MainActivity
import com.example.ussdm.adapter.MyRecyclerAdapter
import com.example.ussdm.databinding.FragmentSMSBinding
import com.example.ussdm.databinding.FragmentUSSDBinding
import com.example.ussdm.model.RecModel


class USSDFragment : Fragment() {

    private lateinit var binding: FragmentUSSDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUSSDBinding.inflate(inflater, container, false)

        val mainActivity = activity as MainActivity
        mainActivity.supportActionBar?.elevation = 0F
        mainActivity.supportActionBar?.title = "USSD kodlar"
        binding.rv.adapter = MyRecyclerAdapter(requireContext(), initList()){

        }
        return binding.root
    }
    private fun initList(): List<RecModel> {
        return listOf(
            RecModel("*102#", "Balans", getString(R.string.desc_50)),
            RecModel("*104#", "Mening raqamim", getString(R.string.desc_50)),
            RecModel("*144#", "Menga qo`ng`iroq qiling", getString(R.string.desc_50)),
            RecModel("*141#", "Boshqa raqamga yo`naltirish", getString(R.string.desc_50)),
            RecModel("*411#", "Vaqtincha aloqada emasman", getString(R.string.desc_50)),
            RecModel("*535#", "Ko`gilochar chat", getString(R.string.desc_50)),
            RecModel("*111#", "Men kimman", getString(R.string.desc_50)),
            RecModel("*096#", "Mega boom", getString(R.string.desc_50))
        )
    }
}
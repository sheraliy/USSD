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
import com.example.ussdm.model.RecModel


class SMSFragment : Fragment() {
private lateinit var binding: FragmentSMSBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentSMSBinding.inflate(inflater, container, false)

        val mainActivity = activity as MainActivity
        mainActivity.supportActionBar?.elevation = 0F
        mainActivity.supportActionBar?.title = "SMS paketlar"
        binding.rv.adapter = MyRecyclerAdapter(requireContext(), initList()){

        }
       return binding.root
    }
    private fun initList(): List<RecModel> {
        return listOf(
            RecModel("10", "SMS 10", getString(R.string.desc_50)),
            RecModel("20", "SMS 20", getString(R.string.desc_50)),
            RecModel( "25", "SMS 25", getString(R.string.desc_50)),
            RecModel("50", "SMS 50", getString(R.string.desc_50)),
            RecModel("100", "SMS 100", getString(R.string.desc_50)),
            RecModel("500", "SMS 500", getString(R.string.desc_50))
        )
    }
}
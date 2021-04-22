package com.example.ussdm.fragments.fragment_reklama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdm.R
import com.example.ussdm.activity.MainActivity
import com.example.ussdm.databinding.FragmentReklamaBinding
import com.example.ussdm.model.Model
import kotlinx.android.synthetic.main.fragment_reklama.view.*


class ReklamaFragment : Fragment() {

    private lateinit var binding: FragmentReklamaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReklamaBinding.inflate(inflater, container, false)

        val mainActivity = activity as MainActivity
        mainActivity.supportActionBar?.elevation = 0F
        mainActivity.supportActionBar?.title = ""

        val model = arguments?.getSerializable("dataAll") as Model

        binding.tarifName.text = model.name_reklama
        binding.min.text = model.minut
        binding.mb.text = model.mb
        binding.sms.text = model.sms
        binding.reklamaBottomText.text = model.narxi
        binding.tvTitle.text = model.name_reklama
        binding.tvOylik.text = model.narxi

        return binding.root
    }
}
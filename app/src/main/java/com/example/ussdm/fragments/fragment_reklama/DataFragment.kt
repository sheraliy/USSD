package com.example.ussdm.fragments.fragment_reklama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ussdm.R
import com.example.ussdm.databinding.FragmentDataBinding
import com.example.ussdm.model.Model
import java.io.Serializable


private const val ARG_PARAM1 = "param1"


class DataFragment : Fragment() {
    private var serializable: Serializable? = null
    private lateinit var _binding: FragmentDataBinding
    private val binding get() = _binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            serializable = it.getSerializable(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDataBinding.inflate(inflater, container, false)
        val model = serializable as Model

        binding.tarifName.text = model.name_reklama
        binding.min.text = model.minut
        binding.mb.text = model.mb
        binding.sms.text = model.sms
        binding.reklamaBottomText.text = model.narxi

        binding.root.setOnClickListener {

            val reklamaFragment = ReklamaFragment()
            val bundle = Bundle()
            bundle.putSerializable("dataAll", model)
            reklamaFragment.arguments = bundle
            findNavController().navigate(R.id.reklamaFragment,bundle)

        }
        return  binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: Model) =
            DataFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)
                }
            }
    }
}
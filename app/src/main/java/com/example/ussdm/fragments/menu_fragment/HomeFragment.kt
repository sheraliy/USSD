package com.example.ussdm.fragments.menu_fragment

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ussdm.activity.MainActivity
import com.example.ussdm.R
import com.example.ussdm.adapter.ViewPagerAdapter
import com.example.ussdm.databinding.FragmentHomeBinding
import com.example.ussdm.model.Model


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val mainActivity = activity as MainActivity
        mainActivity.supportActionBar?.elevation = 0F
        mainActivity.supportActionBar?.title = ""

        val viewPagerAdapter = ViewPagerAdapter(initList(), childFragmentManager)

        binding.viewPager.adapter = viewPagerAdapter
        binding.tablayout.setViewPager(binding.viewPager)

        binding.cardInternet.setOnClickListener {
            findNavController().navigate(R.id.MBFragment)
        }

        binding.cardSms.setOnClickListener {
            findNavController().navigate(R.id.SMSFragment)
        }
        binding.cardXizmat.setOnClickListener {
            findNavController().navigate(R.id.xizmatFragment)
        }
        binding.cardHash.setOnClickListener {
            findNavController().navigate(R.id.USSDFragment)
        }
        binding.cardTarif.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment)
        }
        return binding.root
    }

    private fun initList(): List<Model> {

        return listOf(

            Model("Oddiy 10", "10 MIN", "10 SMS", "10 MB", "Oyiga 10.000 so‘m"),
            Model("Maktab", "200 MIN", "500 SMS", "5000 MB", "Oyiga 29.900 so‘m"),
            Model("Street", "2250 MIN", "750 SMS", "6500 MB", "Oyiga 39.900 so‘m"),
            Model("Onlime", "3000 MIN", "1000 SMS", "10000 MB", "Oyiga 49.900 so‘m"),
            Model("Flash", "3500 MIN", "1500 SMS", "16000 MB", "Oyiga 69.900 so‘m")
        )
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_top_home, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.tg -> {
                Toast.makeText(requireContext(), "##", Toast.LENGTH_SHORT).show()
            }
            R.id.share -> {
                Toast.makeText(requireContext(), "**", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}
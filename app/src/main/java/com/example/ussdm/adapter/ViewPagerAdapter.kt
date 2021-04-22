package com.example.ussdm.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.ussdm.fragments.fragment_reklama.DataFragment
import com.example.ussdm.model.Model

class ViewPagerAdapter(private val list: List<Model>, fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
    return DataFragment.newInstance(list[position])

    }
}
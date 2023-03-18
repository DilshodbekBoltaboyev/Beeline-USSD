package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.adapters.UserDaqiqa
import com.example.myapplication.adapters.daqiqa_Adapter
import com.example.myapplication.databinding.FragmentDaqiqaBinding

class daqiqa_Fragment : Fragment() {
    private val binding by lazy { FragmentDaqiqaBinding.inflate(layoutInflater) }
    private lateinit var list_daqiqa:ArrayList<UserDaqiqa>
    private lateinit var daqiqaAdapte: daqiqa_Adapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        loadData()

        daqiqaAdapte=daqiqa_Adapter(list_daqiqa , binding.root.context)
        binding.rvDaqiqa.adapter=daqiqaAdapte
        return binding.root
    }

    private fun loadData() {
        list_daqiqa=ArrayList()

        list_daqiqa.add(UserDaqiqa(R.drawable.beeline, "#Ko'pso'zla ", "10 000 so'm", "Oy", "*108#"))
    }

}
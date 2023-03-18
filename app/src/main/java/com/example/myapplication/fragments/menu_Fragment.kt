package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMenuBinding


class menu_Fragment : Fragment() {
   private val binding by lazy { FragmentMenuBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding.apply {
            internet.setOnClickListener {

                findNavController().navigate(
                    R.id.internet_Fragment,
                    bundleOf("keyName" to R.id.internet)
                )
            }
            tariflar.setOnClickListener {
                findNavController().navigate(
                    R.id.tarif_Fragment,
                    bundleOf("keyName" to R.id.tariflar)
                )
            }

            sms.setOnClickListener {
                findNavController().navigate(R.id.sms_Fragment, bundleOf("keyName" to R.id.sms))

            }
            daqiqalar.setOnClickListener {
                findNavController().navigate(R.id.daqiqa_Fragment, bundleOf("keyName" to R.id.daqiqalar))

            }
            xizmatlar.setOnClickListener {
                findNavController().navigate(R.id.xizmatlar_Fragment, bundleOf("keyName" to R.id.xizmatlar))

            }
            yangiliklar.setOnClickListener {
                findNavController().navigate(R.id.yangiliklar_Fragment, bundleOf("keyName" to R.id.yangiliklar))
            }
        }

        return binding.root
    }


}
package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.adapters.UserInternet
import com.example.myapplication.adapters.internet_Adapter
import com.example.myapplication.databinding.FragmentInternetBinding


class internet_Fragment : Fragment() {

   private val binding by lazy { FragmentInternetBinding.inflate(layoutInflater) }
    private lateinit var list_internet:ArrayList<UserInternet>
    private lateinit var internetAdapte: internet_Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        loadData()
        internetAdapte= internet_Adapter(binding.root.context, list_internet)
        binding.rvInternet.adapter=internetAdapte

        return binding.root
    }

    private fun loadData() {

        list_internet = ArrayList()
        list_internet.add(
            UserInternet(
                R.drawable.beeline,
                "1000 MB",
                "30 kun",
                "10 000 so'm",
                "*1*01*3588#"
            )
        )
        list_internet.add(
            UserInternet(
                R.drawable.beeline,
                "2000 MB",
                "30 kun",
                "15 000 so'm",
                "*1*02*3588#"
            )
        )
        list_internet.add(
            UserInternet(
                R.drawable.beeline,
                "5000 MB",
                "30 kun",
                "25 000 so'm",
                "*1*05*3588#"
            )
        )
        list_internet.add(
            UserInternet(
                R.drawable.beeline,
                "10 000 MB",
                "30 kun",
                "45 000 so'm",
                "*1*10*3588#"
            )
        )
        list_internet.add(
            UserInternet(
                R.drawable.beeline,
                "30 000 MB",
                "30 kun",
                "75 000 so'm",
                "*1*30*3588#"
            )
        )
        list_internet.add(
            UserInternet(
                R.drawable.beeline,
                "50 000 MB",
                "30 kun",
                "90 000 so'm",
                "*1*50*3588#"
            )
        )
        list_internet.add(
            UserInternet(
                R.drawable.beeline,
                "75 000 MB",
                "30 kun",
                "110 000 so'm",
                "*1*75*3588#"
            )
        )
    }

    }
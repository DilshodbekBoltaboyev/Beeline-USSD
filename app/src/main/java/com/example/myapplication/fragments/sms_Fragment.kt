package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.adapters.UserSms
import com.example.myapplication.databinding.FragmentSmsBinding
import com.example.myapplication.adapters.sms_Adapter

class sms_Fragment : Fragment() {

    private val binding by lazy { FragmentSmsBinding.inflate(layoutInflater) }
    private lateinit var list_sms:ArrayList<UserSms>
    private lateinit var sms_Adapter: sms_Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        loadData()

        sms_Adapter= sms_Adapter(list_sms , binding.root.context)
        binding.rvSms.adapter=sms_Adapter

        return binding.root
    }

    private fun loadData() {

        list_sms = ArrayList()
        list_sms.add(UserSms(R.drawable.beeline, "20 SMS", "500 so'm", "Kun", "*110*161#"))
        list_sms.add(UserSms(R.drawable.beeline, "50 SMS", "1000 so'm", "Kun", "*110*162#"))
        list_sms.add(UserSms(R.drawable.beeline, "250 SMS", "1300 so'm", "Kun", "*110*151#"))
        list_sms.add(UserSms(R.drawable.beeline, "100 SMS", "5263 so'm", "Oy", "*110*044#"))
        list_sms.add(UserSms(R.drawable.beeline, "500 SMS", "13 683 so'm", "Oy", "*110*045#"))
        list_sms.add(UserSms(R.drawable.beeline, "1000 SMS", "22 103 so'm", "Oy", "*110*046#"))
        list_sms.add(UserSms(R.drawable.beeline, "25 SMS(xalqaro)", "5263 so'm", "-", "*110*041#"))
        list_sms.add(UserSms(R.drawable.beeline, "50 SMS(xalqaro)", "8420 so'm", "-", "*110*042#"))
        list_sms.add(UserSms(R.drawable.beeline, "100 SMS(xalqaro)", "12 630 so'm", "-", "*110*043#"))


    }


}
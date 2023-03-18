package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.adapters.UserTarif
import com.example.myapplication.databinding.FragmentTarifBinding
import com.example.myapplication.adapters.tarif_Adapter


class tarif_Fragment : Fragment() {

    private val binding by lazy { FragmentTarifBinding.inflate(layoutInflater) }
    private lateinit var list_tarif: ArrayList<UserTarif>
    private lateinit var tarif_Adapte: tarif_Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        loadData()

        tarif_Adapte = tarif_Adapter(list_tarif , binding.root.context)
        binding.rvTarif.adapter=tarif_Adapte

        return binding.root
    }

    private fun loadData() {

        list_tarif = ArrayList()
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Kunlik",
                "Kun",
                "600 so'm/kun",
                "*110*580#",
                "60 min/kun  60 MB/kun  1 SMS-100 so'm"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "OSON 1",
                "Oylik",
                "40 000 so'm",
                "*2*01#",
                "Cheksiz(min)Internet, 1 MB-1 so'm 1 SMS-1 so'm"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "OSON 10",
                "Oylik",
                "10 000 so'm/oy",
                "*110*61#",
                "10 min/oy.    10 MB/oy.    10 SMS/oy."
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Hammasi ZO'R 1",
                "Oylik",
                "20 000 so'm",
                "*2*3#",
                "1 500 min       3 GB       500 SMS"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Hammasi ZO'R 2",
                "Oylik",
                "30 000 so'm",
                "*2*5#",
                "2 500 min       5 GB       500 SMS"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Hammasi ZO'R 3",
                "Oylik",
                "40 000 so'm",
                "*2*8#",
                "Cheksiz(min)       8 GB       1000 SMS"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Hammasi ZO'R 4",
                "Oylik",
                "60 000 so'm",
                "*2*15#",
                "Cheksiz(min)       15 GB       1000 SMS"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Silver",
                "Oylik",
                "90 000 so'm",
                "*2*30#",
                "Cheksiz(min)       30 GB       2000 SMS\n100 MB Roumingda"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Gold",
                "Oylik",
                "135 000 so'm",
                "*2*50#",
                "Cheksiz(min)       50 GB       2000 SMS\n100 MB Roumingda"
            )
        )
        list_tarif.add(
            UserTarif(
                R.drawable.beeline,
                "Platinum",
                "Oylik",
                "200 000 so'm",
                "*2*150#",
                "Cheksiz(min)       150 GB       2000 SMS\n100 MB Roumingda"
            )
        )

    }

    }
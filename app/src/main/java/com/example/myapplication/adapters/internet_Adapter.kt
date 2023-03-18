package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemDaqiqaBinding
import com.example.myapplication.databinding.ItemInternetBinding
import com.example.myapplication.databinding.ItemTarifBinding

class internet_Adapter(var context: Context, var list: ArrayList<UserInternet>) : RecyclerView.Adapter<internet_Adapter.Vh>() {
    inner  class Vh(var itemInternetBinding: ItemInternetBinding):RecyclerView.ViewHolder(itemInternetBinding.root) {
        fun onBind(userInternet: UserInternet, position: Int) {
            val animation = AnimationUtils.loadAnimation(itemInternetBinding.root.context, R.anim.rv_anim)
            itemInternetBinding.animInternet.startAnimation(animation)
            itemInternetBinding.tvNarx1.text =userInternet.narx
            itemInternetBinding.tvKun1.text=  userInternet.kun
            itemInternetBinding.tvInternet.text=  userInternet.mb
            itemInternetBinding.tvCode1.text=  userInternet.code
            itemInternetBinding.imageUssd.setImageResource(R.drawable.beeline)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemInternetBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
    }

    override fun getItemCount(): Int =list.size
}
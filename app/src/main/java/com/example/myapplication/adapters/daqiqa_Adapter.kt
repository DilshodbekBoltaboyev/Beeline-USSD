package com.example.myapplication.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemDaqiqaBinding
import com.example.myapplication.databinding.XizmatlarItemBinding

class daqiqa_Adapter(var list: List<UserDaqiqa> , var context: Context) : RecyclerView.Adapter<daqiqa_Adapter.Vh>() {
    inner  class Vh(var itemRvBinding: ItemDaqiqaBinding):RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(userDaqiqa: UserDaqiqa, position: Int) {
            val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
            itemRvBinding.animDaqiqa.startAnimation(animation)
            itemRvBinding.tvPrice.text =userDaqiqa.price
            itemRvBinding.tvDay.text=  userDaqiqa.day
            itemRvBinding.tvCountDaqiqa.text = userDaqiqa.count
            itemRvBinding.imageUssd.setImageResource(R.drawable.beeline)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemDaqiqaBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
    }

    override fun getItemCount(): Int =list.size
}
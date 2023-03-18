package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.XizmatlarItemBinding

class xizmatlar_Adapter(var list: List<UserXizmatlar> , var context: Context) : RecyclerView.Adapter<xizmatlar_Adapter.Vh>() {
    inner  class Vh(var itemRvBinding: XizmatlarItemBinding):RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(userXizmatlar: UserXizmatlar, position: Int) {
            val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
            itemRvBinding.animXizmatlar.startAnimation(animation)
             itemRvBinding.tvTitleName.text =userXizmatlar.titleName
            itemRvBinding.information.text=  userXizmatlar.information
            itemRvBinding.yoqish.text = userXizmatlar.yoqish
            itemRvBinding.ochirish.text = userXizmatlar.ochirish
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(XizmatlarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
    }

    override fun getItemCount(): Int =list.size
}
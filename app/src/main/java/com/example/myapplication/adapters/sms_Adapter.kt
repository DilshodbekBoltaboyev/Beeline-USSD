package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemSmsBinding
import com.example.myapplication.databinding.ItemTarifBinding

class sms_Adapter(var list: ArrayList<UserTarif>, var context: Context) : RecyclerView.Adapter<sms_Adapter.Vh>() {
    inner  class Vh(var itemTarifBinding: ItemTarifBinding):RecyclerView.ViewHolder(itemTarifBinding.root) {
        fun onBind(userTarif: UserTarif, position: Int) {
            val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
            itemTarifBinding.animTarif.startAnimation(animation)
            itemTarifBinding.tvName.text =userTarif.nomi
            itemTarifBinding.tvPrice.text=  userTarif.narx
            itemTarifBinding.tvDay.text=  userTarif.kun
            itemTarifBinding.tvCodee.text=  userTarif.code
            itemTarifBinding.info.text=  userTarif.info
            itemTarifBinding.imageUssd.setImageResource(R.drawable.beeline)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemTarifBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
    }

    override fun getItemCount(): Int =list.size
}
package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemSmsBinding
import com.example.myapplication.databinding.ItemTarifBinding

class sms_Adapter(var list: ArrayList<UserSms>, var context: Context) : RecyclerView.Adapter<sms_Adapter.Vh>() {
    inner  class Vh(var itemTarifBinding:ItemSmsBinding):RecyclerView.ViewHolder(itemTarifBinding.root) {
        fun onBind(userTarif: UserSms, position: Int) {
            val animation = AnimationUtils.loadAnimation(context, R.anim.rv_anim)
            itemTarifBinding.animSms.startAnimation(animation)
            itemTarifBinding.tvPrice.text=  userTarif.price
            itemTarifBinding.tvDay.text=  userTarif.day
            itemTarifBinding.tvCountSms.text=  userTarif.count

            itemTarifBinding.imageUssd.setImageResource(R.drawable.beeline)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemSmsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
    }

    override fun getItemCount(): Int =list.size
}
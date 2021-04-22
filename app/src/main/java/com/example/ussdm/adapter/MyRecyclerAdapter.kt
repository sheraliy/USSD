package com.example.ussdm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.ussdm.R
import com.example.ussdm.model.RecModel
import kotlinx.android.synthetic.main.rec_item_paket.view.*

class MyRecyclerAdapter(var context: Context, var list: List<RecModel>, val onClick: (recModel: RecModel) -> Unit) : RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>()  {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun onBind(recModel: RecModel) {
            itemView.apply {

                mainText.text = recModel.mainText
                mainTitle.text = recModel.mainTitle
                tvDesc.text = recModel.mainDesc

            }
            itemView.setOnClickListener {
                onClick(recModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rec_item_paket, parent, false))
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }


}
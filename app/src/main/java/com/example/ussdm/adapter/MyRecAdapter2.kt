package com.example.ussdm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussdm.R
import com.example.ussdm.model.RecModel
import kotlinx.android.synthetic.main.rec_item2.view.*


class MyRecAdapter2(
    var context: Context,
    var list: List<RecModel>,
    val onClick: (recModel: RecModel) -> Unit
) : RecyclerView.Adapter<MyRecAdapter2.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(recModel: RecModel) {
            itemView.apply {
                mainTitle.text = recModel.mainTitle
            }
            itemView.setOnClickListener {
                onClick(recModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rec_item2, parent, false)
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }


}
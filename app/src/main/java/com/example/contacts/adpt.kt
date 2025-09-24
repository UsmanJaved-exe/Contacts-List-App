package com.example.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adpt(private val data: ArrayList<model>
) : RecyclerView.Adapter<Adpt.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.img)
        val tname: TextView=itemView.findViewById(R.id.name)
        val tnumber: TextView=itemView.findViewById(R.id.number)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.model,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val info= data[position]
        holder.img.setImageResource(info.img)
        holder.tname.text=info.name
        holder.tnumber.text=info.number

    }
}


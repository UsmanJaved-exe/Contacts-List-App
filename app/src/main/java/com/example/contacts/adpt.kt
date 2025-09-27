package com.example.contacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.result.PickVisualMediaRequest
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.withContext
import kotlin.contracts.contract

class Adpt(
    private val data: ArrayList<model>
) : RecyclerView.Adapter<Adpt.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout: LinearLayout = itemView.findViewById(R.id.Items)
        val img: ImageView = itemView.findViewById(R.id.img)
        val tname: TextView = itemView.findViewById(R.id.name)
        val tnumber: TextView = itemView.findViewById(R.id.number)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.model, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val info = data[position]
        holder.img.setImageResource(info.img)
        holder.tname.text = info.name
        holder.tnumber.text = info.number


        holder.layout.setOnLongClickListener {
            val dialog =
                LayoutInflater.from(holder.itemView.context).inflate(R.layout.dialog_custom, null)
            val builder = AlertDialog.Builder(holder.itemView.context)
            builder.setView(dialog)

            val box = builder.create()
            box.show()
            val dlt = box.findViewById<LinearLayout>(R.id.btnDelete)
            val edt = box.findViewById<LinearLayout>(R.id.btnEdit)

            dlt?.setOnClickListener {
                data.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(holder.adapterPosition, data.size)
                box.dismiss()
            }

            edt?.setOnClickListener {
                val update = LayoutInflater.from(holder.itemView.context)
                    .inflate(R.layout.activity_create, null)
                val builder2 = AlertDialog.Builder(holder.itemView.context)
                builder2.setView(update)

                val Up = builder2.create()
                Up.show()

                val pic = Up.findViewById<ImageButton>(R.id.Photo)
                val n = Up.findViewById<EditText>(R.id.Name)
                val num = Up.findViewById<EditText>(R.id.contactnumber)
                val updateBtn = Up.findViewById<Button>(R.id.addContact)

                n?.setText(data[position].name)
                num?.setText(data[position].number)


                updateBtn?.setOnClickListener {
                    box.dismiss()
                    val updatedName = n?.text.toString()
                    val updatedNumber = num?.text.toString()

                    val uData = model(R.drawable.user, updatedName, updatedNumber)
                    data[position] = uData
                    notifyItemChanged(position)

                    Up.dismiss()
                }


            }

            return@setOnLongClickListener true
        }

    }
}





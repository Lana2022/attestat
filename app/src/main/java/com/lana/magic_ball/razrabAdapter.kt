package com.lana.magic_ball

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class RazrabAdapter(private val razrabNames: List<String>) :
    RecyclerView.Adapter<RazrabViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RazrabViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.razrab_list_item, parent, false)
        return RazrabViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: RazrabViewHolder, position: Int) {
        val name = razrabNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return razrabNames.size
    }
}
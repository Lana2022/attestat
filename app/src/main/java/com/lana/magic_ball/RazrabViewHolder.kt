package com.lana.magic_ball

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RazrabViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    
    private val razrabNameTextView: TextView = 
        itemView.findViewById(R.id.razrab_name_text_view)
    
    fun bind(name: String) {
        razrabNameTextView.text = name

    }
}
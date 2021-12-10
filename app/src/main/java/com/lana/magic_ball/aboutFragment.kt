package com.lana.magic_ball

import android.content.Intent
import android.icu.lang.UCharacter
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class aboutFragment : Fragment() {

    lateinit var razrabRecyclerView: RecyclerView
    lateinit var otherOptionButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        val razrabNames: List<String> = listOf("Svetlana")

        otherOptionButton = view.findViewById(
            R.id.other_option_button
        )
        razrabRecyclerView = view.findViewById(R.id.razrabRecyclerView)

        razrabRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        razrabRecyclerView.adapter =
            RazrabAdapter(razrabNames)
        otherOptionButton.setOnClickListener {
            val link = Uri.parse("https://mail.ru/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }


}
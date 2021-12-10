package com.lana.magic_ball

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random


class BallFragment : Fragment() {

    lateinit var ballImageView: ImageView
    lateinit var ballButton: Button

    private val ballImageList: List<Int> = listOf(
        R.drawable.da,
        R.drawable.da0,
        R.drawable.da1,
        R.drawable.da2,
        R.drawable.da3,

        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ball, container, false)

        ballImageView = view.findViewById(R.id.ball_image_view)
        ballButton = view.findViewById(R.id.ball_button)

        ballButton.setOnClickListener {
            val randomInt = Random.nextInt(from = 0, until = 5)
            ballImageView.setImageResource(
                ballImageList[randomInt]
            )

        }


        return view


    }

}




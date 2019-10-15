package com.example.linearlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2.*


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        imageView.setImageResource(R.drawable.perfil)
        textView6.text = intent.getStringExtra("name")
        textView7.text = intent.getStringExtra("date")
        textView8.text = intent.getStringExtra("city")
        textView9.text = intent.getStringExtra("description")
    }
}

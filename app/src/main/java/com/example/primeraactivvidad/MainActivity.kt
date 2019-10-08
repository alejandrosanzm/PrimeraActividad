package com.example.primeraactivvidad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var n: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            add()
        }

        button2.setOnClickListener {
            reset()
        }
    }

    fun add(){
        var aux: Int = n + 1
        n = aux
        textView.text = n.toString()
    }

    fun reset(){
        n = 0;
        textView.text = "0"
    }
}

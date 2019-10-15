package com.example.linearlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var requestCode: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            viewActivity()
        }
    }

    private fun viewActivity() {
        val intent = Intent(this, Activity2::class.java)
        intent.putExtra("name", "Juan")
        intent.putExtra("city", "Madrid")
        intent.putExtra("date", "12/02/98")
        intent.putExtra(
            "description",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam egestas egestas augue et iaculis. Pellentesque sit amet consequat purus, et tristique dolor. Suspendisse a lobortis eros. Curabitur iaculis orci sem, ut porta orci volutpat quis. Nunc lobortis blandit est, a feugiat sem molestie a. Morbi congue, lacus in pellentesque pulvinar, ligula dolor elementum turpis, non vehicula quam nisl ut lectus. Vivamus at luctus mauris. Sed bibendum sed nibh vitae ultricies. Nullam at nibh at nunc rhoncus ornare. Vestibulum neque augue, viverra sit amet accumsan sed, finibus sit amet velit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam consequat quam mauris, non pulvinar ante scelerisque vitae. Vestibulum luctus finibus lectus suscipit sollicitudin. Integer vitae odio sit amet ex aliquet lobortis. Fusce ut dui varius, mollis arcu sit amet, volutpat eros."
        )
        intent.putExtra("image", R.drawable.perfil)
        startActivity(intent)
    }
}

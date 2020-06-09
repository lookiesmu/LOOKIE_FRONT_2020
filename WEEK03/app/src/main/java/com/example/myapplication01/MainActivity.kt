package com.example.myapplication01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Abutton.setOnClickListener {
            val intent = Intent(this@MainActivity, AActivity::class.java)
            startActivity(intent)
        }

        Bbutton.setOnClickListener {
            val intent = Intent(this@MainActivity, BActivity::class.java)
            startActivity(intent)
        }

        Cbutton.setOnClickListener {
            val intent = Intent(this@MainActivity, CActivity::class.java)
            startActivity(intent)
        }
    }
}

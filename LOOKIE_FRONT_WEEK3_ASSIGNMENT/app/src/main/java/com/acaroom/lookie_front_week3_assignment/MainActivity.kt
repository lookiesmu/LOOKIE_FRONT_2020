package com.acaroom.lookie_front_week3_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aActivity.setOnClickListener {
            val aintent = Intent(this@MainActivity, AActivity::class.java)
            startActivity(aintent)
        }

        bActivity.setOnClickListener {
            val bintent = Intent(this@MainActivity, BActivity::class.java)
            startActivity(bintent)
        }

        cActivity.setOnClickListener {
            val cintent = Intent(this@MainActivity, CActivity::class.java)
            startActivity(cintent)
        }
    }
}

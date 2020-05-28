package com.example.week3_yjh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        icon.setOnClickListener {
            val intent_button = Intent(this@AActivity, MainActivity::class.java)
            startActivity(intent_button)
        }


    }
}

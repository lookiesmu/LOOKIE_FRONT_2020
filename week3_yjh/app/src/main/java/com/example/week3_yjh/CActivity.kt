package com.example.week3_yjh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_c.*

class CActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        icon.setOnClickListener {
            val intent_button = Intent(this@CActivity, MainActivity::class.java)
            startActivity(intent_button)
        }



    }
}

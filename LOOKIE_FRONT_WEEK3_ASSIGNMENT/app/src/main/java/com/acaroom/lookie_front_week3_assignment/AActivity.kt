package com.acaroom.lookie_front_week3_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        back.setOnClickListener {
            val intent = Intent(this@AActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

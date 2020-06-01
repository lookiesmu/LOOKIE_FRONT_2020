package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val logOut:ImageView=findViewById(R.id.logout)
        val user_name=intent.getStringExtra("user_id")
        hello_name.text="$user_name"

        logOut.setOnClickListener {
            val intent= Intent(this@Main4Activity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goLogin:Button = findViewById(R.id.login)
        val goSign:Button=findViewById(R.id.sign)

        goLogin.setOnClickListener {
            val intent=Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(intent)
        }

        goSign.setOnClickListener {
            val intent=Intent(this@MainActivity, Main3Activity::class.java)
            startActivity(intent)
        }
    }

}

package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val number1 = intent.getIntExtra("number1", 0)
        val number2 = intent.getIntExtra("number2", 0)

        Log.d("number",""+number1)
        Log.d("number",""+number2)


    }
}

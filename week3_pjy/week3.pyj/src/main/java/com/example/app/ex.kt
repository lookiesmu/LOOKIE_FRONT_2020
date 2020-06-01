package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ex : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //화면을 그려주겠다는 뜻
        Log.d("life_cycle","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle","onStop")
        //스탑과 퍼즈 구분 어려움.
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle","onDestroy")
    }
}

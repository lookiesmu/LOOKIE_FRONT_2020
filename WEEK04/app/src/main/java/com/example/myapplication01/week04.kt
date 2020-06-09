package com.example.myapplication01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_week04.*

class week04 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week04)

        button1.setOnClickListener {
            val fragOne : FragOne = FragOne()
            val fragmentManager : FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragOne)
            fragmentTransaction.commit()
        }

        button2.setOnClickListener {
            val fragTwo : FragTwo = FragTwo()
            val fragmentManager : FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragTwo)
            fragmentTransaction.commit()
        }

        button3.setOnClickListener {
            val fragThree : FragThree = FragThree()
            val fragmentManager : FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragThree)
            fragmentTransaction.commit()
        }

        button4.setOnClickListener {
            val fragFour : FragFour = FragFour()
            val fragmentManager : FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragFour)
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

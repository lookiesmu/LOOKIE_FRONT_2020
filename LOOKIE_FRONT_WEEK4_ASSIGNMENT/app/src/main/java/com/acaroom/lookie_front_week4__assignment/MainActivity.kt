package com.acaroom.lookie_front_week4__assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1: Fragment1 = Fragment1()
        val fragment2: Fragment2 = Fragment2()
        val fragment3: Fragment3 = Fragment3()
        val fragment4: Fragment4 = Fragment4()

        button1.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment1)
            fragmentTransaction.commit()
        }

        button2.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment2)
            fragmentTransaction.commit()
        }

        button3.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment3)
            fragmentTransaction.commit()
        }

        button4.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment4)
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

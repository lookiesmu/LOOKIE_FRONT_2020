package com.example.week4

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment0= Fragment0()
        val fragment1= Fragment1()
        val fragment2=Fragment2()
        val fragment3=Fragment3()
        val fragment4= Fragment4()

        val fragmentManager:FragmentManager=supportFragmentManager
        val fragmentTransaction =fragmentManager.beginTransaction()//시작

        fragmentTransaction.replace(R.id.container, fragment0)
        fragmentTransaction.commit()

        btn1.setOnClickListener {
            val fragmentManager:FragmentManager=supportFragmentManager
            val fragmentTransaction =fragmentManager.beginTransaction()//시작

            fragmentTransaction.replace(R.id.container, fragment1)
            fragmentTransaction.commit()
        }
        btn2.setOnClickListener {
            val fragmentManager:FragmentManager=supportFragmentManager
            val fragmentTransaction =fragmentManager.beginTransaction()//시작

            fragmentTransaction.replace(R.id.container, fragment2)
            fragmentTransaction.commit()//끝


        }
        btn3.setOnClickListener {
            val fragmentManager:FragmentManager=supportFragmentManager
            val fragmentTransaction =fragmentManager.beginTransaction()//시작
            fragmentTransaction.replace(R.id.container, fragment3)
            fragmentTransaction.commit()//끝
        }
        btn4.setOnClickListener {
            val fragmentManager:FragmentManager=supportFragmentManager
            val fragmentTransaction =fragmentManager.beginTransaction()//시작
            fragmentTransaction.replace(R.id.container, fragment4)
            fragmentTransaction.commit()//끝
        }
    }
}

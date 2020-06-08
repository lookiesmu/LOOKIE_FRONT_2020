package com.example.week4pjy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 : FragmentOne = FragmentOne()
        val fragment2 : FragmentTwo = FragmentTwo()
        val fragment3 : FragmentThree = FragmentThree()
        val fragment4 : FragmentFour = FragmentFour()

        button1.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, fragment1)
                .commit()
        }

        button2.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, fragment2)
                .commit()
        }

        button3.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, fragment3)
                .commit()
        }
        button4.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, fragment4)
                .commit()
        }

//        button2.setOnClickListener(){
//            //프라그먼트 remove/detach 하는 방법
//            val fragmentManager = supportFragmentManager
//            val fragmentTransaction= fragmentManager.beginTransaction()
//            fragmentTransaction.remove(fragmentOne)
//            fragmentTransaction.commit()
//        }

    }

}

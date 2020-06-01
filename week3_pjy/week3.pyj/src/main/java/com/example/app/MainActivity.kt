package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)


        Change_AActivity.setOnClickListener {
//            val intent=Intent(this@Intent1, Intent2::class.java)
//            //key,value방식->key와 value를 쌍으로 만들어 저장==dictionary
//            intent.putExtra("number",1)
//            intent.putExtra("number",2)
//            startActivity(intent)

            val intenta=Intent(this@MainActivity, AActivity::class.java)
            //Apply->
            intenta.apply{
                this.putExtra("number1", 1)
                this.putExtra("number2", 1)
            }
            startActivity(intenta)
        }
        Change_BActivity.setOnClickListener {
//            val intent=Intent(this@Intent1, Intent2::class.java)
//            //key,value방식->key와 value를 쌍으로 만들어 저장==dictionary
//            intent.putExtra("number",1)
//            intent.putExtra("number",2)
//            startActivity(intent)

            val intentb=Intent(this@MainActivity, BActivity::class.java)
            //Apply->
            intentb.apply{
                this.putExtra("number1", 1)
                this.putExtra("number2", 1)
            }
            startActivity(intentb)
        }
        Change_CActivity.setOnClickListener {
//            val intent=Intent(this@Intent1, Intent2::class.java)
//            //key,value방식->key와 value를 쌍으로 만들어 저장==dictionary
//            intent.putExtra("number",1)
//            intent.putExtra("number",2)
//            startActivity(intent)

            val intentc=Intent(this@MainActivity, CActivity::class.java)
            //Apply->
            intentc.apply{
                this.putExtra("number1", 1)
                this.putExtra("number2", 1)
            }
            startActivity(intentc)
        }

    }
}




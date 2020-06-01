package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var user_id=""
    var user_password=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val back : ImageView = findViewById(R.id.back)
        val login : Button = findViewById(R.id.login_botton)

        var id_listener=EnterListener()
        var password_listener=EnterListener()

        id.setOnEditorActionListener(id_listener)

        password.setOnEditorActionListener(password_listener)

        back.setOnClickListener {
            val intent= Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(intent)
        }
        login_botton.setOnClickListener {
            val intent=Intent(this@Main2Activity, Main4Activity::class.java)
            intent.putExtra("user_id",user_id)
            intent.putExtra("user_password",user_password)
            startActivity(intent)
        }

    }

    inner class EnterListener:TextView.OnEditorActionListener{
        override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
            user_id= id.text.toString()
            user_password=password.text.toString()
            return false
        }
    }
}

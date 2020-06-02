package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val backToLogin : ImageView = findViewById(R.id.sign_back)
        val sign_Button: Button=findViewById(R.id.sign_botton)

        var id_listener=EnterListener1()
        var password_listener=EnterListener1()
        var name_listener=EnterListener1()
        sign_id.setOnEditorActionListener(id_listener)
        sign_password.setOnEditorActionListener(password_listener)
        sign_name.setOnEditorActionListener(name_listener)

        backToLogin.setOnClickListener {
            val intent = Intent(this@Main3Activity, MainActivity::class.java)
            startActivity(intent)
        }
        sign_Button.setOnClickListener {
            val intent = Intent(this@Main3Activity, Main2Activity::class.java)
            startActivity(intent)
        }
    }
    inner class EnterListener1:TextView.OnEditorActionListener{
        override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
            return false
        }
    }
}

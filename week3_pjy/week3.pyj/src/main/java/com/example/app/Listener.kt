package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*//xml을 이 액티비티에서 임포트

class Listener : AppCompatActivity() {

    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        //뷰를 엑티비티로 가져오는 방법
        //1>직접 찾아서 가져온다
 //       val textView : TextView = findViewById(R.id.hello) //id가 hello이면서 textview인 애 가져오기
        //2>xml을 import해서 가져온다
 //       hello

        //익명함수
        //1->람다방식
        hello.setOnClickListener {
            Log.d("click", "Click!!")
        }

        //2->익명함수방식식
       hello.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "Click!!")
                hello.setText("안녕하세요")
                image.setImageResource(R.drawable.aimyon)
                number+=10
                Log.d("number",""+number)
            }
        })
        //3->이름이 필요한 경우(click)
//        val click=object:View.OnClickListener{
//            override  fun onCliick(v: View?){
//                Log.d("click", "Click!!")
//                hello.setText("안녕하세요")
//            }
//        }
//
//        hello.setOnClickListener(click) //리스너 여러개.. 어느것이 적용? 맨 마지막거

        //뷰를 조작하는 함수들들
        //1>setText
        //2>setImageResource(R.drawble.boy)

    }
}


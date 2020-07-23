package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(RetrofitService::class.java)

        //GET
        service.getStudentsList().enqueue(object : Callback<ArrayList<PersonFromServer>>{
            override fun onFailure(call: Call<ArrayList<PersonFromServer>>, t: Throwable) {
                call.isCanceled
                call.isExecuted
                call.cancel()
            }

            override fun onResponse(
                call: Call<ArrayList<PersonFromServer>>,
                response: Response<ArrayList<PersonFromServer>>
            ) {
                if (response.isSuccessful){
                    val personList = response.body()

                    val code = response.code()

                    //val error = response.errorBody()

                    val header = response.headers()
                }
            }
        })

        //POST(1)
//        val params = HashMap<String, Any> ()
//        params.put("name","마라탕")
//        params.put("age","00")
//        params.put("intro","먹고싶다")
//        service.createStdent(params).enqueue(object : Callback<PersonFromServer>{
//            override fun onFailure(call: Call<PersonFromServer>, t: Throwable) {
//
//            }
//
//            override fun onResponse(
//                call: Call<PersonFromServer>,
//                response: Response<PersonFromServer>
//            ) {
//                if (response.isSuccessful) {
//                    val person = response.body()
//                    Log.d("retrofitt", "name : " + person?.name)
//                }
//            }
//        })

        //POST(2)
        val person = PersonFromServer(name = "간장게장", age = 33, intro = "먹고싶다")
        service.createStudentEasy(person).enqueue(object : Callback<PersonFromServer>{
            override fun onFailure(call: Call<PersonFromServer>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<PersonFromServer>,
                response: Response<PersonFromServer>
            ) {
                if (response.isSuccessful) {
                    val person = response.body()
                    Log.d("retrofitt", "name : " + person?.name)
                }
            }
        })

    }
}
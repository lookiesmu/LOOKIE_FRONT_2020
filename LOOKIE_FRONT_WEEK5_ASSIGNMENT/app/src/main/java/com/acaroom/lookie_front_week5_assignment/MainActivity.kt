package com.acaroom.lookie_front_week5_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_view.view.*

class MainActivity : AppCompatActivity() {

    val planList = ArrayList<Plan>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        planList.add(Plan("2020.07.12", "LOOKIE 과제 열심히 하기!"))



        add_plan.setOnClickListener {
            val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_view, null)
            val builder = AlertDialog.Builder(this)
                .setView(dialogView)
            val addPlanDialog = builder.show()
            val date_edit : EditText = dialogView.findViewById(R.id.date_edit)
            val content_edit : EditText = dialogView.findViewById(R.id.content_edit)

            dialogView.add_btn.setOnClickListener {
                planList.add(0, Plan(date_edit.text.toString(), content_edit.text.toString()))
                (recycler_view.adapter as planAdapter).notifyDataSetChanged()
                addPlanDialog.dismiss()
            }

            dialogView.cancel_btn.setOnClickListener {
                addPlanDialog.dismiss()
            }
//            recycler_view.adapter = planAdapter(planList, LayoutInflater.from(this))
        }

        recycler_view.adapter = planAdapter(planList, LayoutInflater.from(this))
        recycler_view.layoutManager = LinearLayoutManager(this)

    }

    override fun onResume() {
        super.onResume()
    }
}




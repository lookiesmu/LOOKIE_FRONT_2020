package com.example.myplanner

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planList=PlanList()

        addBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialog = layoutInflater.inflate(R.layout.dialogview, null)
            val dialog_date = dialog.findViewById<EditText>(R.id.edit_date)
            val dialog_story = dialog.findViewById<EditText>(R.id.edit_contents)

            builder.setView(dialog)
                .setPositiveButton("add") { p0, i ->
                    planList.addPlan(
                        Plan(
                            dialog_date.text.toString(),
                            dialog_story.text.toString()
                        )
                    )
                }
                .setNegativeButton("cancle") { dialogInterface, i ->
                }.show()
        }

        with(recycler_view) {
            this.adapter = PlanAdapter(
                planList,
                LayoutInflater.from(this@MainActivity)
            )
            val back = LinearLayoutManager(this@MainActivity)
            back.reverseLayout = true
            back.stackFromEnd = true
            this.layoutManager = back


        }

    }
}
class PlanList(){
    val planList=ArrayList<Plan>()

    fun addPlan(plan : Plan){
        planList.add(plan)
    }
}
class Plan(val date : String, val story : String){

}
class PlanAdapter(
    val planList : PlanList,
    val inflater:LayoutInflater
): RecyclerView.Adapter<PlanAdapter.ViewHolder>(){

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val date: TextView
            val story:TextView

            init {
                date = itemView.findViewById(R.id.plan_date)
                story=itemView.findViewById(R.id.plan_contents)
            }
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = inflater.inflate(R.layout.planview, parent, false)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int {
            return planList.planList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.date.setText(planList.planList.get(position).date)
            holder.story.setText(planList.planList.get(position).story)
        }

}

package com.example.week5_planner

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val new_planlist: planList = planList()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.dialog_view, null)
            val dialogdate = dialogView.findViewById<EditText>(R.id.write_date)
            val dialogtext = dialogView.findViewById<EditText>(R.id.write_contents)

            builder.setView(dialogView)
                .setPositiveButton("등록") { dialogInterface, i ->
                    new_planlist.addPlan(
                        plan(
                            dialogdate.text.toString(),
                            dialogtext.text.toString()
                        )
                    )
                }
                .setNegativeButton("취소") { dialogInterface, i ->
                    /* 취소일 때 아무 액션이 없으므로 빈칸 */
                }
                .show()
        }

        with(planner_recycler_view) {
            this.adapter = PlanAdapter(
                plan_list = new_planlist,
                inflater = LayoutInflater.from(this@MainActivity),
                activity = this@MainActivity
            )
            val reverseLayoutManager: LinearLayoutManager = LinearLayoutManager(this@MainActivity)
            reverseLayoutManager.reverseLayout = true
            reverseLayoutManager.stackFromEnd = true
            this.layoutManager = reverseLayoutManager


        }

    }


    fun createFakePlan(planitem: plan, plan: planList = planList()): planList {
        plan.addPlan(planitem)
        return plan
    }
}

class PlanAdapter(
    val plan_list: planList,
    val inflater: LayoutInflater,
    val activity: Activity
) : RecyclerView.Adapter<PlanAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val planDate: TextView
        val planContent: TextView

        init {
            planDate = itemView.findViewById(R.id.plan_date)
            planContent = itemView.findViewById(R.id.plan_content)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanAdapter.ViewHolder {
        val view = inflater.inflate(R.layout.plan_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return plan_list.planList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.planDate.setText(plan_list.planList.get(position).date)
        holder.planContent.setText(plan_list.planList.get(position).contents)

    }

}




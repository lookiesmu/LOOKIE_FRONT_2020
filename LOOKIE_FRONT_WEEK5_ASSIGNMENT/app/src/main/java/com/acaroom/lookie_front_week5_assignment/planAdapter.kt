package com.acaroom.lookie_front_week5_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class planAdapter(
    private val planList: ArrayList<Plan>,
    private val inflater: LayoutInflater
):  RecyclerView.Adapter<planAdapter.ViewHolder>() {

    inner class ViewHolder(planView: View): RecyclerView.ViewHolder(planView) {
        val planDate : TextView = planView.findViewById(R.id.plan_date)
        val planContent : TextView = planView.findViewById(R.id.plan_content)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.plan_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return planList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.planDate.text = planList[position].date
        holder.planContent.text = planList[position].content
    }

}
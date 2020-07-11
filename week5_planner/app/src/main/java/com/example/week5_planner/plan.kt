package com.example.week5_planner

class plan (val date: String, val contents: String) {}

class planList(){
    val planList = ArrayList<plan>()

    fun addPlan(plan: plan){
        planList.add(plan)
    }

}
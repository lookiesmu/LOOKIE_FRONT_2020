package com.example.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.myapplication.databinding.ActivityWeek05Binding
import kotlinx.android.synthetic.main.activity_planlist.*
import kotlinx.android.synthetic.main.activity_planlist.view.*
import kotlinx.android.synthetic.main.activity_week05.*

class week05 : AppCompatActivity() {
//
//    lateinit var binding : ActivityWeek05Binding
//    lateinit var viewModel : ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week05)

//        binding = DataBindingUtil.setContentView(this@week05, R.layout.activity_main)
//        viewModel = ViewModelProviders.of(this@week05).get(MainViewModel::class.java)
//        binding.viewModel = week05()
//        binding.lifecycleOwner = this@week05

        enter_button.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            var v1 = layoutInflater.inflate(R.layout.activity_planedit, null)
            builder.setView(v1)

            var listener = DialogInterface.OnClickListener { p0, p1 ->
                var alert = p0 as AlertDialog
                var edit1: EditText? = alert.findViewById<EditText>(R.id.edit_plandate)
                var edit2: EditText? = alert.findViewById<EditText>(R.id.edit_plancontent)

                plandate.text = "${edit1?.text}"
                plancontent.text = "${edit2?.text}"
            }

            builder.setPositiveButton("OK!", listener)
            builder.setNegativeButton("CANCLE", null)

            builder.show()
        }

        /*val plan_list = ArrayList<summerplan>()
            for (i in 0 until 10) {
                plan_list.add(summerplan("", ""))
        }

        val adapter = planAdapter(plan_list, LayoutInflater.from(this@week05))
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this@week05)*/
    }
}

//class MainViewModel : ViewModel() {
//    val date = MutableLiveData<String>()
//    val content = MutableLiveData<String>()
//    val onClickEvent = SingleLiveEvent<Unit>()
//    fun addEvent() = onClickEvent.call()
//}

class summerplan(val date: String, val content : String) {

}

open class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val date : TextView = itemView.findViewById(R.id.plandate)
    val content : TextView = itemView.findViewById(R.id.plancontent)
    fun setItem(item : summerplan){
        date.text = item.date
        content.text = item.content
    }
}

class planAdapter(
    val itemlist : ArrayList<summerplan>,
    val inflater: LayoutInflater
): RecyclerView.Adapter<planAdapter.ViewHolder>() {
    inner class ViewHolder(itemview : View):RecyclerView.ViewHolder(itemview){
        val planDate : TextView
        val planContent : TextView

        init {
            planDate = itemview.findViewById(R.id.plandate)
            planContent = itemview.findViewById(R.id.plancontent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.activity_planlist, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.planDate.setText(itemlist.get(position).date)
        holder.planContent.setText(itemlist.get(position).content)
    }
}

// class planAdapter : RecyclerView.Adapter<planAdapter.ViewHolder>() {
//    val items = ArrayList<summerplan>()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val itemView = inflater.inflate(R.layout.activity_planlist, parent, false)
//
//        return ViewHolder(itemView) }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item : summerplan = items.get(position)
//        holder.setItem(item)
//    }
//
//    fun addItem(item : summerplan){
//        items.add(item) }
//}

//val adapter = planAdapter()

//fun observerViewModel(){
//    with(viewModel){
//        onClickEvent.observe(this@week05, Observer {
//            adapter.addItem(User(viewModel.name.value.toString(), viewModel.birth.value.toString(), viewModel.phone.value.toString()))
//        }
//        )
//    }
//}






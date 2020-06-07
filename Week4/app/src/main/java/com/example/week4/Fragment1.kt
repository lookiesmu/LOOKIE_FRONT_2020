package com.example.week4

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment1:Fragment(){
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //fragment가 인터페이스를 처음으로 그릴때 호출된다.
        //인자가 일반 view의 oncreate보다 2개 더 많다.
        // - inflater : 뷰를 그려주는 역할
        // - container : 부모뷰
        return inflater.inflate(R.layout.fragment1, container, false)
    }
    //activity에서 onCreate에서 했던 작업을 fragment에선 여기서한다.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDetach() {
        super.onDetach()
    }
}
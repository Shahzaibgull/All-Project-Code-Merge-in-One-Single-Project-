package com.example.fragmentexample

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawerandbottomnavigationexample.R


class FragmentOne : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment Status","onAttach: View Created")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment Status","onCreate: View Created")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment Status","onCreateView: View Created")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState:Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Fragment Status","onViewCreated: View Created")
    }
    override fun onStart() {
        super.onStart()
        Log.i("Fragment Status","onStart: View Created")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment Status","onResume: View Created")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment Status","onPause: View Created")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment Status","onStop: View Created")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment Status","onDestroyView: View Created")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment Status","onDestroy: View Created")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment Status","onDetach: View Created")
    }

}
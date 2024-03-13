package com.example.navigationdrawerandbottomnavigationexample.Foreground_Service

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityCallBackBinding

class CallBackActivity : AppCompatActivity() {

    companion object{
        private var myInterfaceCallback: MyInterfaceCallback?=null
        fun setInterfaceInstance(context: Context){
            myInterfaceCallback=context as MyInterfaceCallback?
        }
    }
    private lateinit var binding: ActivityCallBackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCallBackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.moveButtonFirstActivity.setOnClickListener {
            finish()
            myInterfaceCallback!!.callBack("DevSky")
        }

    }
}
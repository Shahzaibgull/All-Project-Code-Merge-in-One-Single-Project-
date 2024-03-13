package com.example.navigationdrawerandbottomnavigationexample.Foreground_Service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.navigationdrawerandbottomnavigationexample.Foreground_Service.CallBackActivity.Companion.setInterfaceInstance
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityForegroundMainBinding

class ForegroundMainActivity : AppCompatActivity(), MyInterfaceCallback {

    private lateinit var binding: ActivityForegroundMainBinding
    private var foregroundServiceIntent: Intent?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_foreground_main)
        setContentView(binding.root)

        binding.moveButtonSecondActivity.setOnClickListener {   //Callback topic example
            setInterfaceInstance(this@ForegroundMainActivity)
            startActivity(Intent(this@ForegroundMainActivity, CallBackActivity::class.java))
        }

        binding.dataBindingTest.text="Hello ViewBinding"  // databinding topic example
        binding.message="Hello DataBinding"

        foregroundServiceIntent=Intent(this, NewService::class.java)
        binding.buttonFragmentOne.setOnClickListener {

            binding.buttonFragmentSecond.background=resources.getDrawable(R.drawable.common_background2)
            binding.buttonFragmentOne.background=resources.getDrawable(R.drawable.click_background)
            startService(foregroundServiceIntent)

        }
        binding.buttonFragmentSecond.setOnClickListener {

            binding.buttonFragmentOne.background=resources.getDrawable(R.drawable.common_background)
            binding.buttonFragmentSecond.background=resources.getDrawable(R.drawable.click_background)
            stopService(foregroundServiceIntent)
        }
    }

    override fun callBack(data: String?)
    {
        Toast.makeText(this, "Data Receive: $data", Toast.LENGTH_SHORT).show()
    }
}
package com.example.navigationdrawerandbottomnavigationexample.Broadcast_Receiver

import android.annotation.SuppressLint
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationdrawerandbottomnavigationexample.R

class BroadcastMainActivity : AppCompatActivity() {
    private lateinit var receiver: Broadcast

    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_main)

        //ACTION_AIRPLANE_MODE_CHANGED
        receiver=Broadcast()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also{
            registerReceiver(receiver,it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}
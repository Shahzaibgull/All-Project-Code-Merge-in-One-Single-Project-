package com.example.navigationdrawerandbottomnavigationexample.Task_3_Battery_Notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {   //received broadcast if the device is restart
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            val serviceIntent = Intent(context, BatteryStatusService::class.java)
            ContextCompat.startForegroundService(context, serviceIntent)
        }
    }
}

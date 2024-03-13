package com.example.navigationdrawerandbottomnavigationexample.Task_3_Battery_Notification

import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.example.navigationdrawerandbottomnavigationexample.R

class BatteryStatusService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val channelId = "BatteryStatusChannel"
        val notification = NotificationCompat.Builder(this, channelId)   // build the notification with all properties
            .setContentTitle("Battery Status")
            .setContentText(getBatteryStatus())
            .setSmallIcon(R.drawable.baseline_battery_4_bar_24)
            .build()

        startForeground(1, notification)

        return START_STICKY
    }

    private fun getBatteryStatus(): String {    // get the battery status in percentage using battery manger

        val batteryManager = getSystemService(Context.BATTERY_SERVICE) as BatteryManager
        val batteryPercent = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)
        return "Battery Level: $batteryPercent%"
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}

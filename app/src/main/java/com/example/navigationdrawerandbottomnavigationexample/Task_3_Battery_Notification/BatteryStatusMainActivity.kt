package com.example.navigationdrawerandbottomnavigationexample.Task_3_Battery_Notification

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityBatteryStatusMainBinding

class BatteryStatusMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBatteryStatusMainBinding

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBatteryStatusMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {  // creating notification channel
            val channelId = "BatteryStatusChannel"
            val channel = NotificationChannel(channelId, "Battery Status Channel", NotificationManager.IMPORTANCE_LOW)
            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }

        binding.startButton.setOnClickListener { // start the foreground service
            binding.stopButton.background=resources.getDrawable(R.drawable.stop_background)
            binding.startButton.background=resources.getDrawable(R.drawable.click_background)
            val serviceIntent = Intent(this, BatteryStatusService::class.java)
            ContextCompat.startForegroundService(this, serviceIntent)
        }

        binding.stopButton.setOnClickListener { // stop the foreground service
            binding.startButton.background=resources.getDrawable(R.drawable.start_background)
            binding.stopButton.background=resources.getDrawable(R.drawable.click_background)
            val serviceIntent = Intent(this, BatteryStatusService::class.java)
            ContextCompat.startForegroundService(this, serviceIntent)
            stopService(serviceIntent)
        }
    }
}
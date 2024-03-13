package com.example.navigationdrawerandbottomnavigationexample.Background_Service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.navigationdrawerandbottomnavigationexample.BackgroundService
import com.example.navigationdrawerandbottomnavigationexample.R

/*import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.servicesexamples.BackgroundService*/

class MainActivityBackground : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.background_activity_main)

        val buttonFirst=findViewById<Button>(R.id.buttonFragmentOne)
        val buttonSecond=findViewById<Button>(R.id.buttonFragmentSecond)

        buttonFirst.setOnClickListener {

            buttonSecond.background=resources.getDrawable(R.drawable.common_background2)
            buttonFirst.background=resources.getDrawable(R.drawable.click_background)
            startService(Intent(this, BackgroundService::class.java))
        }
        buttonSecond.setOnClickListener {

            buttonFirst.background=resources.getDrawable(R.drawable.common_background)
            buttonSecond.background=resources.getDrawable(R.drawable.click_background)
            stopService(Intent(this, BackgroundService::class.java))
        }
    }

}
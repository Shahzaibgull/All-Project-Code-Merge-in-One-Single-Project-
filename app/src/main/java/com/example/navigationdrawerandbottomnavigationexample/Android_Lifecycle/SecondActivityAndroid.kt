package com.example.navigationdrawerandbottomnavigationexample.Android_Lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.navigationdrawerandbottomnavigationexample.Android_Lifecycle.AndroidMainActivity
import com.example.navigationdrawerandbottomnavigationexample.R

class SecondActivityAndroid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_second)

        var Button_Back = findViewById<Button>(R.id.BackButton)
        Button_Back.setOnClickListener {
            startActivity(Intent(this, AndroidMainActivity::class.java))
        }
    }
}
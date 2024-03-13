package com.example.navigationdrawerandbottomnavigationexample.Android_Lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
/*import com.example.application_lifecycle.SecondActivityAndroid*/
import com.example.navigationdrawerandbottomnavigationexample.R

class AndroidMainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_main)
         var TextView :TextView=findViewById<TextView>(R.id.TextViewButton)
        Log.i("MainActivity","onCreate")

      TextView.setOnClickListener {
          startActivity(Intent(this, SecondActivityAndroid::class.java))
     }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity","onDestroy")
    }
}
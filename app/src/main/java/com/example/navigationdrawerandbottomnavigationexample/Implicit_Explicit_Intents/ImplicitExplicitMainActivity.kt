package com.example.navigationdrawerandbottomnavigationexample.Implicit_Explicit_Intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import com.example.navigationdrawerandbottomnavigationexample.R

class ImplicitExplicitMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_explicit_main)

        val youtube=findViewById<Button>(R.id.button)
        youtube.setOnClickListener {
            val urlIntent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(urlIntent)
        }

        val sendData=findViewById<Button>(R.id.button2)
        sendData.setOnClickListener {

            val sendIntent=Intent().apply {
                action=Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"This is dummy data to send other Apps")
                type="text/plain"
            }
            val shareIntent=Intent.createChooser(sendIntent,null)
            startActivity(shareIntent)
        }

        val openCamera=findViewById<Button>(R.id.button3)
        openCamera.setOnClickListener {

            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)
        }

    }
}
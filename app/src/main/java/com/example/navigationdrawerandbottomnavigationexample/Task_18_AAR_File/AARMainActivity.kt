package com.example.navigationdrawerandbottomnavigationexample.Task_18_AAR_File

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.showToast
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityAarMainBinding

class AARMainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityAarMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAarMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            showToast(this, "This is a toast from Module")
        }
    }
}
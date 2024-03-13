package com.example.navigationdrawerandbottomnavigationexample.Shared_Preferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityShareprefrencesMainBinding

class SharePreferencesMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShareprefrencesMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shareprefrences_main)
        binding= ActivityShareprefrencesMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createButton.setOnClickListener {

            val sharedPref: SharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPref.edit()
            editor.putString("namekey", binding.userNameID.text.toString())
            editor.putString("phonekey", binding.userPhoneID.text.toString())
            editor.putString("emailKey", binding.userEmailID.text.toString())
            editor.putString("instituteKey", binding.userInstituteID.text.toString())
            editor.putString("yearKey", binding.userYearID.text.toString())
            editor.putString("cityKey", binding.userCityID.text.toString())
            editor.apply()

            startActivity(Intent(this, SharePreferencesProfile_Settings::class.java))
        }


    }
}
package com.example.navigationdrawerandbottomnavigationexample.Task_13_Admob_Samples.Native_Ads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.Task_13_Admob_Samples.Ads.loadSmallMediumSizeNativeAds
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityNativeAdsBinding

class NativeAdsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNativeAdsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNativeAdsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadSmallMediumSizeNativeAds(this, R.string.native_ads1, binding.templateView)
    }
}
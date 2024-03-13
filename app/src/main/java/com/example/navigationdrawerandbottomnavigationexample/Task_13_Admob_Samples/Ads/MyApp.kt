package com.example.navigationdrawerandbottomnavigationexample.Task_13_Admob_Samples.Ads

import android.app.Application
import com.google.android.gms.ads.MobileAds

class MyApp: Application(){
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this) {}
    }
}
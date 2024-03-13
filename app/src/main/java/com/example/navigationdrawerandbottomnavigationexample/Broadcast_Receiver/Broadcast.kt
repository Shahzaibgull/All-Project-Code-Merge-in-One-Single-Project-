package com.example.navigationdrawerandbottomnavigationexample.Broadcast_Receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Broadcast : BroadcastReceiver()
{
    private  var context: Context?=null

    override fun onReceive(p0: Context?, intent: Intent?) {

        val isAeroplaneModeEnabled=intent?.getBooleanExtra("state", false) ?: return

        if( isAeroplaneModeEnabled){

            Toast.makeText(context, "Aero Plane Mode Enable", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context, "Aero Plane Mode Enable", Toast.LENGTH_LONG).show()
        }
    }
}
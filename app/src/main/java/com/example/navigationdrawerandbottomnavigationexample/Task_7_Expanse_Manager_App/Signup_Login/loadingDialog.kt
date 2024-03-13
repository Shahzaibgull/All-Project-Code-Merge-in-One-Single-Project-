package com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Signup_Login

import android.app.Activity
import android.app.AlertDialog
import android.view.Gravity

import com.example.navigationdrawerandbottomnavigationexample.R

class loadingDialog(private val activity: Activity) {
    private var dialog: AlertDialog? = null

    fun startLoadingDialog() {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity.layoutInflater
        builder.setView(inflater.inflate(R.layout.custom_dialog, null))
        builder.setCancelable(true)
        dialog?.window?.setGravity(Gravity.CENTER)
        dialog = builder.create()
        dialog?.show()
    }

    fun dismissDialog() {
        dialog?.dismiss()
    }
}
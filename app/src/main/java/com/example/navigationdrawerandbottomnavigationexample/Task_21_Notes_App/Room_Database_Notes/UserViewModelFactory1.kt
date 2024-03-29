package com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.ViewModel.UserViewModel1


class UserViewModelFactory1(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel1::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return UserViewModel1(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

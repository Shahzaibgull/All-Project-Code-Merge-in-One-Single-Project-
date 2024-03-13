package com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.ViewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.Model.User1
import com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.Repository.UserRepository1

class UserViewModel1(private val context: Context):ViewModel() {

    val user1ListLiveData: LiveData<List<User1>> = UserRepository1.getAllUserData(context)

    fun insert1(context: Context, user1: User1) {
        UserRepository1.insert(context, user1)
    }

    fun getAllUserData(context: Context): LiveData<List<User1>>?
    {
        return UserRepository1.getAllUserData(context)
    }

    fun updateUser(context: Context, user1: User1) {
        UserRepository1.updateUser(context, user1)
    }

    fun deleteUser(context: Context, user1: User1) {
        UserRepository1.deleteUser(context, user1)
    }

}
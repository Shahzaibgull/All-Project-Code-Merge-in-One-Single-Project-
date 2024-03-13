package com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.Dao.UserDao1
import com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.Model.User1

@Database(entities = [User1::class], version = 3)
abstract class UserDatabase1 : RoomDatabase(){

    abstract fun getDao(): UserDao1

    companion object{

        private const val DATABASE_NAME="UserDatabase"
        @Volatile
        var instance: UserDatabase1?=null

        fun getInstance(context: Context): UserDatabase1?{
            if (instance==null){
                synchronized(UserDatabase1::class.java)
                {
                    if (instance==null)
                    {
                        instance= Room.databaseBuilder(
                            context,
                            UserDatabase1::class.java,
                            DATABASE_NAME)
                            .fallbackToDestructiveMigration()
                            .build()
                    }
                }
            }
            return instance
        }
    }
}
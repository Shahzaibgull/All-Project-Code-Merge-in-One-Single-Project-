package com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Signup_Login

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



@Database(entities = [Student::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun studentDao(): StudentDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase?=null

        fun getDatabase(context: Context): AppDatabase{
            val tempInstance= INSTANCE
            if (tempInstance!=null){
                return tempInstance
            }
            synchronized(this)
            {
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database")
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE=instance
                return instance
            }

        }
    }
}
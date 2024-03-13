package com.example.navigationdrawerandbottomnavigationexample.Room_Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RoomStudent::class], version = 2)
abstract class RoomAppDatabase : RoomDatabase() {
    abstract fun RoomDao(): RoomDao

    companion object{
        @Volatile
        private var INSTANCE: RoomAppDatabase?=null

        fun getDatabase(context: Context): RoomAppDatabase{
            val tempInstance= INSTANCE
            if (tempInstance!=null){
                return tempInstance
            }
            synchronized(this)
            {
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    RoomAppDatabase::class.java,
                    "app_database")
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE=instance
                return instance
            }

        }
    }
}
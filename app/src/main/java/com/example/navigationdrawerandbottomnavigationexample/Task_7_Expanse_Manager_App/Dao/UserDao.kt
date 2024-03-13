package com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Model.User


@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBalance(user: User)

    @Query("SELECT * FROM user ORDER BY id ASC")
    fun getAllUserData(): LiveData<List<User>>

    @Update
    suspend fun updateUser(user: User)

    @Query("UPDATE user SET name=:firstName, age=:lastName")
    suspend fun update(firstName: String, lastName: String)


    @Delete
    suspend fun deleteUser(user: User)
}
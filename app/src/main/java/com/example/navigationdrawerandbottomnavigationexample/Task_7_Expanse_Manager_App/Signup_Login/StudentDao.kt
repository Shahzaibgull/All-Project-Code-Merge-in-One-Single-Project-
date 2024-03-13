package com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Signup_Login

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query


@Dao
interface StudentDao {
    @PrimaryKey(autoGenerate = true)

    /*@Query("SELECT * FROM student_table WHERE first_name = :userName LIMIT 1")
    suspend fun findByName(userName: String): Student?

    @Query("SELECT * FROM student_table WHERE your_password = :userPassword LIMIT 1")
    suspend fun findByPassword(userPassword: String): Student?*/

    @Query("SELECT * FROM student_table WHERE first_name = :userName AND your_password = :userPassword LIMIT 1")
    suspend fun findByCredentials(userName: String, userPassword: String): Student?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student: Student)

    @Query("SELECT COUNT(*) FROM student_table")
    suspend fun hasLoggedInUser(): Int



    ////////////////////////

    /*@Query("SELECT * FROM student_table")
    fun getAll(): List<Student>

    @Query("SELECT * FROM student_table WHERE roll_no LIKE :roll LIMIT 1")
    suspend fun findByRoll(roll: Int): Student

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert1(student: Student)

    @Delete
    suspend fun delete(student: Student)

    @Query("DELETE FROM student_table")
    suspend fun deleteALL()

    *//*@Query("DELETE FROM sqlite_sequence WHERE name='student_table'")
    suspend fun repeatPrimaryKey()*//*

    @Query("UPDATE student_table SET first_name1=:firstName, last_Name1=:lastName WHERE roll_no LIKE :roll")
    suspend fun update(firstName: String, lastName: String, roll: Int)*/


}
package com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Signup_Login

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="student_table")
data class Student(
    @PrimaryKey(autoGenerate = false) val id:Int?,
    @ColumnInfo(name="first_name") val firstName: String?,
    @ColumnInfo(name="last_name") val lastName: String?,
    @ColumnInfo(name="your_password") val yourPassword: String?,
    @ColumnInfo(name="your_age") val yourAge: Int?,

    /*@ColumnInfo(name="first_name1") val firstName1: String?,
    @ColumnInfo(name="last_name1") val lastName1: String?,
    @ColumnInfo(name="roll_no") val rollNo: Int?*/
    )


package com.example.navigationdrawerandbottomnavigationexample.Room_Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="student_table1")
data class RoomStudent(
    @PrimaryKey(autoGenerate = true) val id:Int?,
    @ColumnInfo(name="first_name1") val firstName1: String?,
    @ColumnInfo(name="last_name1") val lastName1: String?,
    @ColumnInfo(name="roll_no") val rollNo: Int?
)

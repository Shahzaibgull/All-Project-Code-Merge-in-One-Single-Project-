package com.example.navigationdrawerandbottomnavigationexample.Room_Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query

@Dao
interface RoomDao {
    @PrimaryKey(autoGenerate = true)
    @Query("SELECT * FROM student_table1")
    fun getAll(): List<RoomStudent>

    @Query("SELECT * FROM student_table1 WHERE roll_no LIKE :roll LIMIT 1")
    suspend fun findByRoll(roll: Int): RoomStudent

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(studentRoom: RoomStudent)

    @Delete
    suspend fun delete(studentRoom: RoomStudent)

    @Query("DELETE FROM student_table1")
    suspend fun deleteALL()

    /*@Query("DELETE FROM sqlite_sequence WHERE name='student_table'")
    suspend fun repeatPrimaryKey()*/

    @Query("UPDATE student_table1 SET first_name1=:firstName, last_Name1=:lastName WHERE roll_no LIKE :roll")
    suspend fun update(firstName: String, lastName: String, roll: Int)
}
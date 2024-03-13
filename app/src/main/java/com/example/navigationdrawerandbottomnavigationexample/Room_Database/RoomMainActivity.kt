package com.example.navigationdrawerandbottomnavigationexample.Room_Database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityRoomMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RoomMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoomMainBinding
    private lateinit var appDb1: RoomAppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRoomMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appDb1=RoomAppDatabase.getDatabase(this)

        binding.btnWriteData.setOnClickListener {
            writeData()
        }
        binding.btnReadData.setOnClickListener {
            readData()
        }
        binding.btnDeleteData.setOnClickListener {
            GlobalScope.launch {
                appDb1.RoomDao().deleteALL()
                Toast.makeText(this@RoomMainActivity, "Successfully Deleted", Toast.LENGTH_SHORT).show()
                //appDb.clearAllTables()
                //appDb.studentDao().repeatPrimaryKey()
            }
        }
        binding.btnUpdateData.setOnClickListener {
            updateData()
        }
    }

    private fun updateData() {

        val firstName=binding.etFirstName.text.toString()
        val lastName=binding.etLastName.text.toString()
        val rollNo=binding.etRollNo.text.toString()

        if(firstName.isNotEmpty() && lastName.isNotEmpty() && rollNo.isNotEmpty()){

            GlobalScope.launch(Dispatchers.IO) {
                appDb1.RoomDao().update(firstName,lastName,rollNo.toInt())
            }
            binding.etFirstName.text.clear()
            binding.etLastName.text.clear()
            binding.etRollNo.text.clear()
            Toast.makeText(this@RoomMainActivity, "Successfully Update", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@RoomMainActivity, "Please Enter Data", Toast.LENGTH_SHORT).show()
        }
    }

    private fun writeData(){
        val firstName=binding.etFirstName.text.toString()
        val lastName=binding.etLastName.text.toString()
        val rollNo=binding.etRollNo.text.toString()

        if(firstName.isNotEmpty() && lastName.isNotEmpty() && rollNo.isNotEmpty()){
            val roomStudent= RoomStudent(null,firstName,lastName, rollNo.toInt())
            GlobalScope.launch(Dispatchers.IO) {
                appDb1.RoomDao().insert(roomStudent)
            }

            binding.etFirstName.text.clear()
            binding.etLastName.text.clear()
            binding.etRollNo.text.clear()
            Toast.makeText(this@RoomMainActivity, "Successfully Written", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this@RoomMainActivity, "Please Enter Data", Toast.LENGTH_SHORT).show()
        }

    }
    private fun readData(){

        val rollNo=binding.etRollNoRead.text.toString()
        if(rollNo.isNotEmpty()){
            lateinit var roomStudent:RoomStudent
            //val roomStudent= RoomStudent(null,null,null,rollNo.toInt())
            GlobalScope.launch {
                roomStudent=appDb1.RoomDao().findByRoll(rollNo.toInt())
                //appDb1.RoomDao().findByRoll(roomStudent)
                displayData(roomStudent)
            }
        }
    }
    private suspend fun displayData(roomStudent: RoomStudent) {

        withContext(Dispatchers.Main){
            binding.tvFirstName.text=roomStudent.firstName1
            binding.tvLastName.text=roomStudent.lastName1
            binding.tvRollNo.text=roomStudent.rollNo.toString()
        }

    }
}
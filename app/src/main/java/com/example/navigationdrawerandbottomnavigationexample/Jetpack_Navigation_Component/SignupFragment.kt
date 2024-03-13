package com.example.navigationdrawerandbottomnavigationexample.Jetpack_Navigation_Component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.navigationdrawerandbottomnavigationexample.databinding.FragmentSignupBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class SignupFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding
    //private lateinit var appDb: AppDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSignupBinding.inflate(inflater, container, false)
        //appDb=AppDatabase.getDatabase(requireContext())

        binding.buttonSignup.setOnClickListener {

            //writeData()
        }
        return binding.root
    }

    /*private fun writeData(){
        val firstName=binding.etFirstName.text.toString()
        val lastName=binding.etLastName.text.toString()
        val yourPassword=binding.etYourPassword.text.toString()
        val yourAge=binding.etYourAge.text.toString()

        if(firstName.isNotEmpty() && lastName.isNotEmpty() && yourPassword.isNotEmpty() && yourAge.isNotEmpty()){
            val student= Student(
                null,firstName,lastName,yourPassword,yourAge.toInt()
            )
            GlobalScope.launch(Dispatchers.IO) {
                appDb.studentDao().insert(student)
            }
            binding.etFirstName.text.clear()
            binding.etLastName.text.clear()
            binding.etYourAge.text.clear()

            Toast.makeText(requireContext(), "Successfully Signup", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(requireContext(), "Please Enter Data", Toast.LENGTH_SHORT).show()
        }

    }*/
}
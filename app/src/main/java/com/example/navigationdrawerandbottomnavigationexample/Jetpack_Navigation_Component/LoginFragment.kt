package com.example.navigationdrawerandbottomnavigationexample.Jetpack_Navigation_Component

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.navigationdrawerandbottomnavigationexample.Shared_Preferences.SharePreferencesProfile_Settings
import com.example.navigationdrawerandbottomnavigationexample.databinding.FragmentLoginBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    //private lateinit var appDb: AppDatabase

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentLoginBinding.inflate(inflater, container, false)
        //appDb=AppDatabase.getDatabase(requireContext())

        binding.buttonLogin.setOnClickListener {
            //readDataFromDatabase()
        }
        return binding.root
    }
    /*private fun readDataFromDatabase(){

        val nameLogin=binding.etfirstNameLogin.text.toString()
        val passwordLogin=binding.etPasswordLogin.text.toString()

        if(nameLogin.isNotEmpty() && passwordLogin.isNotEmpty()){

            GlobalScope.launch {
                val getName=appDb.studentDao().findByName(nameLogin)
                val getPassword=appDb.studentDao().findByPassword(passwordLogin)
                if (nameLogin==getName.toString() && passwordLogin==getPassword.toString())
                {
                    startActivity(Intent(requireContext(), SharePreferencesProfile_Settings::class.java))
                }
                else
                {
                    Toast.makeText(requireContext(), "Incorrect credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }*/
}
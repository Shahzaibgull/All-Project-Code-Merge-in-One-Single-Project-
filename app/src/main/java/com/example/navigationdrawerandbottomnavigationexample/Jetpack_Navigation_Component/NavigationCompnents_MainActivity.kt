package com.example.navigationdrawerandbottomnavigationexample.Jetpack_Navigation_Component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.navigationdrawerandbottomnavigationexample.R
/*import com.example.jetpacknavigationexample.databinding.ActivityMainBinding*/
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityNaviagtionComponentMainBinding

class NavigationCompnents_MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var binding: ActivityNaviagtionComponentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNaviagtionComponentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar)

    }

    override fun onSupportNavigateUp(): Boolean {
        navController=findNavController(R.id.NavHostFragment_ContainerView)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
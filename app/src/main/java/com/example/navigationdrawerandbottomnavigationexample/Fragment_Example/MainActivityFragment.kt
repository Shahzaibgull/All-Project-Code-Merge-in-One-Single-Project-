package com.example.navigationdrawerandbottomnavigationexample.Fragment_Example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragmentexample.FragmentOne
import com.example.fragmentexample.FragmentSecond
import com.example.navigationdrawerandbottomnavigationexample.R

class MainActivityFragment : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_activity_main)

        val buttonFirst=findViewById<Button>(R.id.buttonFragmentOne)
        val buttonSecond=findViewById<Button>(R.id.buttonFragmentSecond)


        buttonFirst.setOnClickListener {

            buttonSecond.background=resources.getDrawable(R.drawable.common_background2)
            buttonFirst.background=resources.getDrawable(R.drawable.click_background)
            goToFragment(FragmentOne())
        }
        buttonSecond.setOnClickListener {

            buttonFirst.background=resources.getDrawable(R.drawable.common_background)
            buttonSecond.background=resources.getDrawable(R.drawable.click_background)
            goToFragment(FragmentSecond())
        }


    }

    private fun goToFragment(fragment: Fragment){
        val transition= supportFragmentManager.beginTransaction()
        transition.replace(R.id.fragmentContainer,fragment)
        transition.addToBackStack(null)
        transition.commit()

        /*fragmentManager=supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()*/
    }
}
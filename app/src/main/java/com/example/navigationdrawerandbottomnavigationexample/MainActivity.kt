package com.example.navigationdrawerandbottomnavigationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.navigationdrawerandbottomnavigationexample.Bottom_Navigation.CartFragment
import com.example.navigationdrawerandbottomnavigationexample.Bottom_Navigation.HomeFragment
import com.example.navigationdrawerandbottomnavigationexample.Bottom_Navigation.MenuFragment
import com.example.navigationdrawerandbottomnavigationexample.Bottom_Navigation.ProfileFragment
import com.example.navigationdrawerandbottomnavigationexample.Navigation_Drawer.BeautyFragment
import com.example.navigationdrawerandbottomnavigationexample.Navigation_Drawer.ElectronicsFragment
import com.example.navigationdrawerandbottomnavigationexample.Navigation_Drawer.FashionFragment
import com.example.navigationdrawerandbottomnavigationexample.Navigation_Drawer.FreshFragment
import com.example.navigationdrawerandbottomnavigationexample.Navigation_Drawer.FurnitureFragment
import com.example.navigationdrawerandbottomnavigationexample.Navigation_Drawer.PrimeFragment
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var fragmentManager : FragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        val toggle= ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.nav_open, R.string.nav_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationDrawer.setNavigationItemSelectedListener(this)

        binding.bottomNavigation.background=null
        binding.bottomNavigation.setOnItemSelectedListener { item, ->
            when(item.itemId){
                R.id.bottom_home -> openFragment(HomeFragment())
                R.id.bottom_profile -> openFragment(ProfileFragment())
                R.id.bottom_cart -> openFragment(CartFragment())
                R.id.bottom_menu -> openFragment(MenuFragment())
                R.id.fab-> Toast.makeText(this, "Categories", Toast.LENGTH_SHORT).show()
            }
            true
        }
        fragmentManager=supportFragmentManager
        openFragment(HomeFragment())
        /*binding.fab.setOnClickListener{
            Toast.makeText(this, "Categories", Toast.LENGTH_SHORT).show()
        }*/
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
         when(item.itemId){
             R.id.nav_prime -> openFragment(PrimeFragment())
             R.id.nav_fashion -> openFragment(FashionFragment())
             R.id.nav_electronics -> openFragment(ElectronicsFragment())
             R.id.nav_beauty -> openFragment(BeautyFragment())
             R.id.nav_fresh -> openFragment(FreshFragment())
             R.id.nav_furniture -> openFragment(FurnitureFragment())
         }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
    override fun onBackPressed(){
        super.onBackPressed()
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }
        else{
            super.onBackPressedDispatcher.onBackPressed()
        }
    }
    private fun openFragment(fragment: Fragment){
        val fragmentTransaction: FragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
package com.example.navigationdrawerandbottomnavigationexample.Task_2_Tablayout

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityTablayoutMainBinding
import java.util.Stack


class Tablayout_MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTablayoutMainBinding
    private val fragmentStack: Stack<Int> = Stack()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTablayoutMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            showExitCustomDialogBox()
        }

        val fragmentArrayList= ArrayList<Fragment>()  //add fragment to arraylist
        fragmentArrayList.add(Fragment_1())
        fragmentArrayList.add(Fragment_2())
        fragmentArrayList.add(Fragment_3())
        fragmentArrayList.add(Fragment_4())
        fragmentArrayList.add(Fragment_5())
        fragmentArrayList.add(Fragment_6())
        fragmentArrayList.add(Fragment_7())
        fragmentArrayList.add(Fragment_8())
        fragmentArrayList.add(Fragment_9())
        fragmentArrayList.add(Fragment_10())

        val adapter= ViewPagerAdapter(this, supportFragmentManager, fragmentArrayList)  //initialize and set up the viewpager and tabLayout
        binding.viewPagerID.adapter=adapter
        binding.tabs.setupWithViewPager(binding.viewPagerID)

        binding.viewPagerID.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {          //add listener for viewpager
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) { } //Not Used
            override fun onPageSelected(position: Int)
            {
                fragmentStack.push(position)  // current fragment position store in stack
            }
            override fun onPageScrollStateChanged(state: Int) { } //Not Used
        })
    }

    override fun onBackPressed() {
        if (fragmentStack.size > 1) {
            fragmentStack.pop() // remove top fragment in stack
            val previousPosition = fragmentStack.peek() // after 1st fragment pop (read the top most fragment)
            binding.viewPagerID.currentItem = previousPosition
        } else {
            binding.viewPagerID.currentItem = 0 // move to the fragment 1
            if (fragmentStack.isNotEmpty()) {
                fragmentStack.pop() // clear the stack
            } else {
                super.onBackPressed() // handle the default back button behavior
            }
        }
    }


    private fun showExitCustomDialogBox(){      // custom dialog box
        val dialog= Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.layout_custom_dailog)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btnYes : Button = dialog.findViewById(R.id.buttonYes)
        val btnNo : Button = dialog.findViewById(R.id.buttonNo)

        btnYes.setOnClickListener {
            finish()
        }
        btnNo.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

}
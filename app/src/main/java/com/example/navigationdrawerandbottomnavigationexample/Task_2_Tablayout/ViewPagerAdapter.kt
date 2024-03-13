package com.example.navigationdrawerandbottomnavigationexample.Task_2_Tablayout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(val context: Context, fragmentManager: FragmentManager, val list: ArrayList<Fragment>) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
         return 10
    }
    override fun getItem(position: Int): Fragment {
        return list[position]
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return Tab_Title[position]
    }
    companion object{
        val Tab_Title= arrayOf("(1)","(2)","(3)","(4)","(5)","(6)","(7)","(8)","(9)","10")
    }
}
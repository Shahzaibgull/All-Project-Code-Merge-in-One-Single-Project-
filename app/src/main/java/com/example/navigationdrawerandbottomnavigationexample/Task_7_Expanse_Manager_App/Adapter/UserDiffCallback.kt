package com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.Model.User



class UserDiffCallback(private val oldList: List<User>, private val newList: List<User>) : DiffUtil.Callback() {
    override fun getOldListSize() = oldList.size
    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}
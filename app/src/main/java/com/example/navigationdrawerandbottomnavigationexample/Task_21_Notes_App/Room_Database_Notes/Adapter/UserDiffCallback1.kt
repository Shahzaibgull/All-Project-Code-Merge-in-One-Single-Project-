package com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.Adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.Room_Database_Notes.Model.User1

class UserDiffCallback1(private val oldList: List<User1>, private val newList: List<User1>) : DiffUtil.Callback() {
    override fun getOldListSize() = oldList.size
    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}
package com.example.navigationdrawerandbottomnavigationexample.Recycler_View

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdrawerandbottomnavigationexample.databinding.RecyclerItemViewBinding
/*import com.example.task_recycler_view.databinding.RecyclerItemViewBinding*/

//Adapter extend with : Recycler View
class Adapter_Class(var dataList: ArrayList<Data_Model_Class>, val listener: MyClickListener):RecyclerView.Adapter<Adapter_Class.myViewHolder>() {

    //Use binding(itemView not use - to get the id of Views like findViewById)
    inner class myViewHolder(var binding: RecyclerItemViewBinding): RecyclerView.ViewHolder(binding.root){
        init {
            binding.root.setOnClickListener{
                val position=adapterPosition
                listener.onClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        /*var view=LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_view,parent,false)              //Old method - use-FindViewById
        return myViewHolder(view)*/
        var bindingView=RecyclerItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)  //New method - use- Binding
        return myViewHolder(bindingView)
    }
    override fun getItemCount(): Int {
        return dataList.size    //get the list item size
    }
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.binding.profile1.setImageResource(dataList[position].profile) // (profile) from data class //(profile1 - ID)
        holder.binding.textView1.text=(dataList[position].name) // (name) from data class //(textView1 - ID)
    }

    interface MyClickListener{
        fun onClick(position: Int)
    }
}
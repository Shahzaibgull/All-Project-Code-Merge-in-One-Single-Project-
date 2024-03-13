package com.example.navigationdrawerandbottomnavigationexample.Task_4_Gallery_App

// GalleryAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.Task_15_Motion_Layout.Task_8_Whatsapp_Status_Saver.StatusAdapter

class GalleryAdapter(
    private val items: List<GalleryItem>,
    private var itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(uri: String)
    }

    /*fun setItemClickListener(listener: StatusAdapter.ItemClickListener) {
        this.itemClickListener = listener
    }*/

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        val imageView = holder.itemView.findViewById<ImageView>(R.id.imageView2)

        when {
            item.uri.endsWith(".mp4") -> {
                // It's a video
                Glide.with(imageView.context)
                    .load(R.drawable.baseline_play_circle_24)
                    .into(imageView)

                val playIcon = holder.itemView.findViewById<ImageView>(R.id.playIcon)
                playIcon.visibility = View.VISIBLE

                /*imageView.setOnClickListener {
                    itemClickListener.onItemClick(item.uri)
                }*/
            }
            else -> {
                // It's an image
                val playIcon = holder.itemView.findViewById<ImageView>(R.id.playIcon)
                playIcon.visibility = View.GONE
                Glide.with(imageView.context)
                    .load(item.uri)
                    .into(imageView)

                /*imageView.setOnClickListener {
                    itemClickListener.onItemClick(item.uri)
                }*/
            }
        }
        imageView.setOnClickListener {
            itemClickListener.onItemClick(item.uri)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

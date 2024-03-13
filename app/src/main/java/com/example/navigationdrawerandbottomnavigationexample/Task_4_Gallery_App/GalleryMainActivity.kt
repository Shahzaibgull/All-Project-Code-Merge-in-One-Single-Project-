package com.example.navigationdrawerandbottomnavigationexample.Task_4_Gallery_App


import android.content.ContentResolver
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.Task_15_Motion_Layout.Task_8_Whatsapp_Status_Saver.PreviewActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_15_Motion_Layout.Task_8_Whatsapp_Status_Saver.StatusAdapter
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityGalleryMainBinding


class GalleryMainActivity : AppCompatActivity(), GalleryAdapter.OnItemClickListener {

    private lateinit var binding: ActivityGalleryMainBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Adjust the span count as needed

        val galleryItems = loadGalleryItems()
        val galleryAdapter = GalleryAdapter(galleryItems, this)
        //galleryAdapter.setItemClickListener(this)
        recyclerView.adapter = galleryAdapter
    }

    private fun loadGalleryItems(): List<GalleryItem> {
        val galleryItems = mutableListOf<GalleryItem>()

        val imageProjection = arrayOf(
            MediaStore.Images.Media._ID,
            MediaStore.Images.Media.DATA
        )

        val imageCursor = contentResolver.query(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            imageProjection,
            null,
            null,
            null
        )

        imageCursor?.use {
            val columnIndex = it.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
            while (it.moveToNext()) {
                val imageUri = it.getString(columnIndex)
                galleryItems.add(GalleryItem(imageUri, ItemType.IMAGE))
            }
        }

        val videoProjection = arrayOf(
            MediaStore.Video.Media._ID,
            MediaStore.Video.Media.DATA
        )

        val videoCursor = contentResolver.query(
            MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
            videoProjection,
            null,
            null,
            null
        )

        videoCursor?.use {
            val columnIndex = it.getColumnIndexOrThrow(MediaStore.Video.Media.DATA)
            while (it.moveToNext()) {
                val videoUri = it.getString(columnIndex)
                galleryItems.add(GalleryItem(videoUri, ItemType.VIDEO))
            }
        }
        return galleryItems
    }

    override fun onItemClick(uri: String) {
        // Function to handle item click
        val previewIntent = Intent(this, PreviewActivity::class.java)
        previewIntent.putExtra("URI", uri)
        startActivity(previewIntent)
    }
}
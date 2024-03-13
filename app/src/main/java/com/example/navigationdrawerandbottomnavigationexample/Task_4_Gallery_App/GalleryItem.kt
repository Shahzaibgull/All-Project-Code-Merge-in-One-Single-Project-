package com.example.navigationdrawerandbottomnavigationexample.Task_4_Gallery_App

data class GalleryItem(val uri: String, val type: ItemType)

enum class ItemType {
    IMAGE, VIDEO
}
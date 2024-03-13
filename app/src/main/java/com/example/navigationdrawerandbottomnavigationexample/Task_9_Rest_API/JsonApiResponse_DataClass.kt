package com.example.navigationdrawerandbottomnavigationexample.Task_9_Rest_API

import com.google.gson.annotations.SerializedName

data class JsonApiResponse_DataClass(

    @SerializedName("userId" ) var userId : Int?    = null,
    @SerializedName("id"     ) var id     : Int?    = null,
    @SerializedName("title"  ) var title  : String? = null,
    @SerializedName("body"   ) var body   : String? = null
)


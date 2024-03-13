package com.example.navigationdrawerandbottomnavigationexample.Recycler_View

import com.example.navigationdrawerandbottomnavigationexample.R

object List_Data_Initialize {
    private lateinit var dataList: ArrayList<Data_Model_Class>  //Create variable of Data List
    fun getData():ArrayList<Data_Model_Class>
    {
        dataList=ArrayList<Data_Model_Class>()
        dataList.add(Data_Model_Class(R.drawable.a,"Fragment & Lifecycle"))
        dataList.add(Data_Model_Class(R.drawable.b,"Background Service"))
        dataList.add(Data_Model_Class(R.drawable.c,"Foreground Service"))
        dataList.add(Data_Model_Class(R.drawable.d,"Broadcast Receiver"))
        dataList.add(Data_Model_Class(R.drawable.e,"Room Database"))
        dataList.add(Data_Model_Class(R.drawable.f,"Application Lifecycle"))
        //
        dataList.add(Data_Model_Class(R.drawable.a,"Implicit/Explicit Intent"))
        dataList.add(Data_Model_Class(R.drawable.b,"Default Widgets"))
        dataList.add(Data_Model_Class(R.drawable.c,"Custom Widgets"))
        dataList.add(Data_Model_Class(R.drawable.d,"Shared Preferences"))
        dataList.add(Data_Model_Class(R.drawable.e,"Jetpack Navigation\nComponents"))
        dataList.add(Data_Model_Class(R.drawable.f,"Task Tablayout with\nDialog Box"))
        //
        dataList.add(Data_Model_Class(R.drawable.a,"Task Calculator App"))
        dataList.add(Data_Model_Class(R.drawable.b,"Task Battery\nNotification"))
        dataList.add(Data_Model_Class(R.drawable.c,"Task Gallery App"))
        dataList.add(Data_Model_Class(R.drawable.d,"Task Programmatically\nUI"))
        dataList.add(Data_Model_Class(R.drawable.e,"Task Canvas Clock"))
        dataList.add(Data_Model_Class(R.drawable.f,"Task Expanse Manager"))
        //
        dataList.add(Data_Model_Class(R.drawable.a,"Task Whatsapp\nStatus Saver"))
        dataList.add(Data_Model_Class(R.drawable.b,"Task Rest API"))
        dataList.add(Data_Model_Class(R.drawable.c,"Task Animation"))
        dataList.add(Data_Model_Class(R.drawable.d,"Task DevSky QR\nScanner"))
        dataList.add(Data_Model_Class(R.drawable.e,"Task Scientific\nCalculator"))
        dataList.add(Data_Model_Class(R.drawable.f,"Task Admob Samples"))
        //
        dataList.add(Data_Model_Class(R.drawable.a,"Task Localization"))
        dataList.add(Data_Model_Class(R.drawable.b,"Task Motion Layout"))
        dataList.add(Data_Model_Class(R.drawable.c,"Task Overlay Service"))
        dataList.add(Data_Model_Class(R.drawable.d,"Task NDK C++/.so\nCalculator"))
        dataList.add(Data_Model_Class(R.drawable.e,"Task .aar integration\n"))
        dataList.add(Data_Model_Class(R.drawable.f,"Task Image Filter"))
        //
        dataList.add(Data_Model_Class(R.drawable.a,"Task Internal Storage"))
        dataList.add(Data_Model_Class(R.drawable.b,"Task Notes App"))
        return dataList
    }
}
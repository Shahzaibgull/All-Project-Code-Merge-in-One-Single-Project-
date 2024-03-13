package com.example.navigationdrawerandbottomnavigationexample.Bottom_Navigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationdrawerandbottomnavigationexample.Android_Lifecycle.AndroidMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Background_Service.MainActivityBackground
import com.example.navigationdrawerandbottomnavigationexample.Broadcast_Receiver.BroadcastMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Custom_Widgets.CustomWidgetsMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Default_Widgets.DefaultWidgetsMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Foreground_Service.ForegroundMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Fragment_Example.MainActivityFragment
import com.example.navigationdrawerandbottomnavigationexample.Implicit_Explicit_Intents.ImplicitExplicitMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Jetpack_Navigation_Component.NavigationCompnents_MainActivity
import com.example.navigationdrawerandbottomnavigationexample.Recycler_View.Adapter_Class
import com.example.navigationdrawerandbottomnavigationexample.Recycler_View.List_Data_Initialize
import com.example.navigationdrawerandbottomnavigationexample.Room_Database.RoomMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Shared_Preferences.SharePreferencesMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_10_Animation.AnimationMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_12_Scientific_Calculator.ScientificMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_13_Admob_Samples.Ads.MainBannerAdds
import com.example.navigationdrawerandbottomnavigationexample.Task_14_Localization.LocalizationMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_15_Motion_Layout.MotionLayoutMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_16_Overlay_Service.OverlayMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_2_Tablayout.Tablayout_MainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_3_Battery_Notification.BatteryStatusMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_4_Gallery_App.GalleryMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_5_Programatically_UI.ProgramaticallyMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_6_Canvas_Clock.CanvasClockMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_7_Expanse_Manager_App.HomeScreen
import com.example.navigationdrawerandbottomnavigationexample.Task_15_Motion_Layout.Task_8_Whatsapp_Status_Saver.WhatsappMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_17_NDK_SO_File.NDKMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_18_AAR_File.AARMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_19_Filters.FilterMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_20_Internal_Storage.ReadWriteFiles
import com.example.navigationdrawerandbottomnavigationexample.Task_21_Notes_App.NotesMainActivity
import com.example.navigationdrawerandbottomnavigationexample.Task_9_Rest_API.RestAPIMainActivity
import com.example.navigationdrawerandbottomnavigationexample.databinding.FragmentHomeBinding

import java.lang.IllegalArgumentException

class HomeFragment : Fragment(), Adapter_Class.MyClickListener {

    private lateinit var homeBinding: FragmentHomeBinding
    private lateinit var adapterClass: Adapter_Class   //Create variable of Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeBinding=FragmentHomeBinding.inflate(inflater, container, false)
        adapterClass=Adapter_Class(List_Data_Initialize.getData(), this) //create object if Adapter
        homeBinding.myRecyclerView.layoutManager= LinearLayoutManager(context)
        homeBinding.myRecyclerView.adapter=adapterClass //attach Adapter with Recycler View
        return homeBinding.root
    }

    override fun onClick(position: Int) {
         when(position){
             0-> startActivity(Intent(activity, MainActivityFragment::class.java))
             1-> startActivity(Intent(activity, MainActivityBackground::class.java))
             2-> startActivity(Intent(activity, ForegroundMainActivity::class.java))
             3-> startActivity(Intent(activity, BroadcastMainActivity::class.java))
             4-> startActivity(Intent(activity, RoomMainActivity::class.java))
             5-> startActivity(Intent(activity, AndroidMainActivity::class.java))
             6-> startActivity(Intent(activity, ImplicitExplicitMainActivity::class.java))
             7-> startActivity(Intent(activity, DefaultWidgetsMainActivity::class.java))
             8-> startActivity(Intent(activity, CustomWidgetsMainActivity::class.java))
             9-> startActivity(Intent(activity, SharePreferencesMainActivity::class.java))
             10-> startActivity(Intent(activity, NavigationCompnents_MainActivity::class.java))
             11-> startActivity(Intent(activity, Tablayout_MainActivity::class.java))
             12-> startActivity(Intent(activity, ScientificMainActivity::class.java))
             13-> startActivity(Intent(activity, BatteryStatusMainActivity::class.java))
             14-> startActivity(Intent(activity, GalleryMainActivity::class.java))
             15-> startActivity(Intent(activity, ProgramaticallyMainActivity::class.java))
             16-> startActivity(Intent(activity, CanvasClockMainActivity::class.java))
             17-> startActivity(Intent(activity, HomeScreen::class.java))
             18-> startActivity(Intent(activity, WhatsappMainActivity::class.java))
             19-> startActivity(Intent(activity, RestAPIMainActivity::class.java))
             20-> startActivity(Intent(activity, AnimationMainActivity::class.java))
             21-> startActivity(Intent(activity, AnimationMainActivity::class.java)) //DevSky QR Scanner
             22-> startActivity(Intent(activity, ScientificMainActivity::class.java))
             23-> startActivity(Intent(activity, MainBannerAdds::class.java))
             24-> startActivity(Intent(activity, LocalizationMainActivity::class.java))
             25-> startActivity(Intent(activity, MotionLayoutMainActivity::class.java))
             26-> startActivity(Intent(activity, OverlayMainActivity::class.java))
             27-> startActivity(Intent(activity, NDKMainActivity::class.java))
             28-> startActivity(Intent(activity, AARMainActivity::class.java))
             29-> startActivity(Intent(activity, FilterMainActivity::class.java))
             30-> startActivity(Intent(activity, ReadWriteFiles::class.java))
             31-> startActivity(Intent(activity, NotesMainActivity::class.java))
             else -> throw IllegalArgumentException("invalid item type")
         }
    }
}
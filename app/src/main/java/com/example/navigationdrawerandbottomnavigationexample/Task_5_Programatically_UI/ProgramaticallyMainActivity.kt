package com.example.navigationdrawerandbottomnavigationexample.Task_5_Programatically_UI

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import com.example.navigationdrawerandbottomnavigationexample.R

class ProgramaticallyMainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)

        val constraintLayout=ConstraintLayout(this)
        constraintLayout.layoutParams=ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)


        constraintLayout.setBackgroundResource(R.drawable.main_background_shape)      //set custom shape as a background
        constraintLayout.setPadding(60,50,60,0)                  //set layout margin


        val profileImageView = ImageView(this)                                 //Create profileImageView
        profileImageView.id = ViewCompat.generateViewId()
        profileImageView.layoutParams = ViewGroup.LayoutParams(120, 120)
        profileImageView.setImageResource(R.drawable.profile)
        constraintLayout.addView(profileImageView)


        val menuImageView = ImageView(this)                                    // Create menuImageView
        menuImageView.id = ViewCompat.generateViewId()
        menuImageView.layoutParams = ViewGroup.LayoutParams(120, 120)
        menuImageView.setImageResource(R.drawable.baseline_menu_24)
        constraintLayout.addView(menuImageView)


        val welcomeTextView = TextView(this)                                   // Create welcomeTextView
        welcomeTextView.id = ViewCompat.generateViewId()
        welcomeTextView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        welcomeTextView.text = "Welcome!"
        welcomeTextView.setTextColor(resources.getColor(R.color.white))
        welcomeTextView.textSize = 24f
        welcomeTextView.setPadding(0,30,0,0)
        constraintLayout.addView(welcomeTextView)


        val balanceTextView = TextView(this)                                  // Create balanceTextView
        balanceTextView.id = ViewCompat.generateViewId()
        balanceTextView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        balanceTextView.text = "Acc Balance"
        balanceTextView.setTextColor(resources.getColor(R.color.white))
        balanceTextView.textSize = 24f
        balanceTextView.setPadding(0,30,0,0)
        constraintLayout.addView(balanceTextView)


        val shahzaibTextView = TextView(this)                                 // Create shahzaibTextView
        shahzaibTextView.id = ViewCompat.generateViewId()
        shahzaibTextView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        shahzaibTextView.text = "Shahzaib Gul"
        shahzaibTextView.setTextColor(resources.getColor(R.color.white))
        shahzaibTextView.textSize = 30f
        shahzaibTextView.setTypeface(null, Typeface.BOLD)
        shahzaibTextView.setPadding(0,50,0,40)
        constraintLayout.addView(shahzaibTextView)


        val amountBalanceTextView = TextView(this)                            // Create amountBalance text view
        amountBalanceTextView.id = ViewCompat.generateViewId()
        amountBalanceTextView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        amountBalanceTextView.text = "$13400"
        amountBalanceTextView.setTextColor(resources.getColor(R.color.white))
        amountBalanceTextView.textSize = 30f
        amountBalanceTextView.setTypeface(null, Typeface.BOLD)
        amountBalanceTextView.setPadding(0,50,0,0)
        constraintLayout.addView(amountBalanceTextView)


        val searchTextView = TextView(this)                                    // Create searchTextView
        searchTextView.id = ViewCompat.generateViewId()
        searchTextView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 150
        )
        searchTextView.gravity= Gravity.FILL_VERTICAL
        searchTextView.text = "Search Here"
        searchTextView.setTextColor(ContextCompat.getColor(this, R.color.search_bar_text_color))
        searchTextView.textSize = 20f
        searchTextView.background = ContextCompat.getDrawable(this, R.drawable.common_background_programatically)
        searchTextView.setPadding(40, 0, 40, 0)
        val searchIcon = ContextCompat.getDrawable(this, R.drawable.baseline_search_24)
        searchTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, searchIcon, null)
        constraintLayout.addView(searchTextView)


        val transportTextView = TextView(this)                                 // Create transportTextView
        transportTextView.id = ViewCompat.generateViewId()
        transportTextView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        transportTextView.text = "Transport List"
        transportTextView.setTextColor(resources.getColor(R.color.white))
        transportTextView.textSize = 30f
        transportTextView.setTypeface(null, Typeface.BOLD)
        transportTextView.setPadding(0,20,0,40)
        constraintLayout.addView(transportTextView)



        val bikeCardView = CardView(this)                                        // Create bikeCardView 440,480
        bikeCardView.id = ViewCompat.generateViewId()
        bikeCardView.layoutParams = ViewGroup.LayoutParams(
            440,
            480
        )
        bikeCardView.radius = 150f

        val bikeImageView = ImageView(this)                // Create the ImageView inside the bikeCardView
        bikeImageView.id = ViewCompat.generateViewId()
        val bikeImageViewLayoutParams = ConstraintLayout.LayoutParams(
            150,
            150
        )
        bikeImageViewLayoutParams.setMargins(150, 140, 0, 0)
        bikeImageView.layoutParams = bikeImageViewLayoutParams
        bikeImageView.setImageResource(R.drawable.baseline_directions_bike_24)
        bikeCardView.addView(bikeImageView)

        val bikeTextView = TextView(this)                  // Create the TextView inside the bikeCardView
        bikeTextView.id = ViewCompat.generateViewId()
        val bikeTextViewLayoutParams = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        bikeTextViewLayoutParams.setMargins(160, 280, 0, 0)
        bikeTextView.layoutParams = bikeTextViewLayoutParams
        bikeTextView.setTextColor(resources.getColor(android.R.color.black))
        bikeTextView.text = "Bike"
        bikeTextView.setTextColor(Color.parseColor("#9C27B0"))
        bikeTextView.textSize = 24f
        bikeTextView.setTypeface(null, Typeface.BOLD)
        bikeCardView.addView(bikeTextView)
        constraintLayout.addView(bikeCardView)     // Add CardView to main ConstraintLayout




        val busCardView = CardView(this)                                       // Create the busCardView
        busCardView.id = ViewCompat.generateViewId()
        busCardView.layoutParams = ViewGroup.LayoutParams(
            440,
            480
        )
        busCardView.radius = 150f

        val busImageView = ImageView(this)                 // Create the ImageView inside the busImageView
        busImageView.id = ViewCompat.generateViewId()
        val busImageViewLayoutParams = ConstraintLayout.LayoutParams(
            150,
            150
        )
        busImageViewLayoutParams.setMargins(150, 140, 0, 0)
        busImageView.layoutParams = busImageViewLayoutParams
        busImageView.setImageResource(R.drawable.baseline_directions_bus_24)
        busCardView.addView(busImageView)

        val busTextView = TextView(this)                   // Create the TextView inside the busImageView
        busTextView.id = ViewCompat.generateViewId()
        val busTextViewLayoutParams = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        busTextViewLayoutParams.setMargins(173, 280, 0, 0)
        busTextView.layoutParams = busTextViewLayoutParams
        busTextView.setTextColor(resources.getColor(android.R.color.black))
        busTextView.text = "Bus"
        busTextView.setTextColor(Color.parseColor("#9C27B0"))
        busTextView.textSize = 24f
        busTextView.setTypeface(null, Typeface.BOLD)
        busCardView.addView(busTextView)
        constraintLayout.addView(busCardView)        // Add CardView to main ConstraintLayout




        val taxiCardView = CardView(this)                                     // Create the taxiCardView
        taxiCardView.id = ViewCompat.generateViewId()
        taxiCardView.layoutParams = ViewGroup.LayoutParams(
            440,
            480
        )
        taxiCardView.radius = 150f
        // Create the ImageView
        val taxiImageView = ImageView(this)                    // Create the ImageView inside the taxiImageView
        taxiImageView.id = ViewCompat.generateViewId()
        val taxiImageViewLayoutParams = ConstraintLayout.LayoutParams(
            150,
            150
        )
        taxiImageViewLayoutParams.setMargins(150, 140, 0, 0)
        taxiImageView.layoutParams = taxiImageViewLayoutParams
        taxiImageView.setImageResource(R.drawable.baseline_local_taxi_24)
        taxiCardView.addView(taxiImageView)

        val taxiTextView = TextView(this)                    // Create the TextView inside the taxiTextView
        taxiTextView.id = ViewCompat.generateViewId()
        val taxiTextViewLayoutParams = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        taxiTextViewLayoutParams.setMargins(165, 280, 0, 0)
        taxiTextView.layoutParams = taxiTextViewLayoutParams
        taxiTextView.setTextColor(resources.getColor(android.R.color.black))
        taxiTextView.text = "Taxi"
        taxiTextView.setTextColor(Color.parseColor("#9C27B0"))
        taxiTextView.textSize = 24f
        taxiTextView.setTypeface(null, Typeface.BOLD)
        taxiCardView.addView(taxiTextView)
        constraintLayout.addView(taxiCardView)      // Add CardView to main ConstraintLayout




        val truckCardView = CardView(this)                                    // Create the CardView
        truckCardView.id = ViewCompat.generateViewId()
        truckCardView.layoutParams = ViewGroup.LayoutParams(
            440,
            480
        )
        truckCardView.radius = 150f

        val truckImageView = ImageView(this)                   // Create the ImageView inside the truckImageView
        truckImageView.id = ViewCompat.generateViewId()
        val truckImageViewLayoutParams = ConstraintLayout.LayoutParams(
            150,
            150
        )
        truckImageViewLayoutParams.setMargins(150, 140, 0, 0)
        truckImageView.layoutParams = truckImageViewLayoutParams
        truckImageView.setImageResource(R.drawable.baseline_fire_truck_24)
        truckCardView.addView(truckImageView)

        val truckTextView = TextView(this)                    // Create the TextView inside the truckTextView
        truckTextView.id = ViewCompat.generateViewId()
        val truckTextViewLayoutParams = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        truckTextViewLayoutParams.setMargins(150, 280, 0, 0)
        truckTextView.layoutParams = truckTextViewLayoutParams
        truckTextView.setTextColor(resources.getColor(android.R.color.black))
        truckTextView.text = "Truck"
        truckTextView.setTextColor(Color.parseColor("#9C27B0"))
        truckTextView.textSize = 24f
        truckTextView.setTypeface(null, Typeface.BOLD)
        truckCardView.addView(truckTextView)
        constraintLayout.addView(truckCardView)         // Add CardView to main ConstraintLayout




        val constraintSet = ConstraintSet()                                   // Create ConstraintSet to for all Views
        constraintSet.clone(constraintLayout)

        with(constraintSet) {

            connect(
                profileImageView.id,       // profileImage set it constraints
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP
            )
            connect(
                profileImageView.id,
                ConstraintSet.START,
                ConstraintSet.PARENT_ID,
                ConstraintSet.START
            )
            connect(
                menuImageView.id,          // menuImageView set it constraints
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP
            )

            connect(
                menuImageView.id,
                ConstraintSet.END,
                ConstraintSet.PARENT_ID,
                ConstraintSet.END
            )





            connect(
                welcomeTextView.id,         // welcomeTextView set it constraints
                ConstraintSet.TOP,
                profileImageView.id,
                ConstraintSet.BOTTOM
            )
            connect(                       // balanceTextView set it constraints
                balanceTextView.id,
                ConstraintSet.TOP,
                menuImageView.id,
                ConstraintSet.BOTTOM
            )
            connect(
                balanceTextView.id,
                ConstraintSet.END,
                ConstraintSet.PARENT_ID,
                ConstraintSet.END
            )




            connect(
                shahzaibTextView.id,       // shahzaibTextView set it constraints
                ConstraintSet.TOP,
                welcomeTextView.id,
                ConstraintSet.BOTTOM
            )
            connect(
                amountBalanceTextView.id,    // amountBalanceTextView set it constraints
                ConstraintSet.TOP,
                balanceTextView.id,
                ConstraintSet.BOTTOM
            )
            connect(
                amountBalanceTextView.id,
                ConstraintSet.END,
                ConstraintSet.PARENT_ID,
                ConstraintSet.END
            )



            connect(
                searchTextView.id,          // searchTextView set it constraints
                ConstraintSet.TOP,
                shahzaibTextView.id,
                ConstraintSet.BOTTOM,
            )
            connect(
                transportTextView.id,        // transportTextView set it constraints
                ConstraintSet.TOP,
                searchTextView.id,
                ConstraintSet.BOTTOM,
            )



            connect(                          //  bikeCardView set it constraints
                bikeCardView.id,
                ConstraintSet.TOP,
                transportTextView.id,
                ConstraintSet.BOTTOM,
            )



            connect(                             //
                busCardView.id,
                ConstraintSet.TOP,
                transportTextView.id,
                ConstraintSet.BOTTOM
            )                                    //  busCardView set it constraints
            /*connect(
                busCardView.id,
                ConstraintSet.START,
                bikeCardView.id,
                ConstraintSet.END   // 520 margin
            )*/
            connect(
                busCardView.id,
                ConstraintSet.END,
                ConstraintSet.PARENT_ID,
                ConstraintSet.END   //
            )



            connect(                             //
                taxiCardView.id,
                ConstraintSet.TOP,
                bikeCardView.id,
                ConstraintSet.BOTTOM,
            )                                     // taxiCardView set it constraints
            connect(
                taxiCardView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM   //-20
            )




            connect(
                truckCardView.id,               //
                ConstraintSet.TOP,
                busCardView.id,
                ConstraintSet.BOTTOM,
            )
            /*connect(
                truckCardView.id,
                ConstraintSet.START,
                ConstraintSet.PARENT_ID,          // truckCardView set it constraints
                ConstraintSet.START,520
            )*/
            connect(
                truckCardView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM,   //-20
            )
            connect(
                truckCardView.id,
                ConstraintSet.END,
                ConstraintSet.PARENT_ID,
                ConstraintSet.END,   //-20
            )




        }

        constraintSet.applyTo(constraintLayout)          // Apply the constraints
        setContentView(constraintLayout)                 // Set the content view to ConstraintLayout

    }
}
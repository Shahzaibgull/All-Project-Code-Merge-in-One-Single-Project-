package com.example.navigationdrawerandbottomnavigationexample.Task_10_Animation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationdrawerandbottomnavigationexample.R
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityAnimationMainBinding

class AnimationMainActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")

    private var lastX: Float = 0f
    private var lastY: Float = 0f
    private var isDragging: Boolean = false

    private lateinit var binding: ActivityAnimationMainBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.textView.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    lastX = event.rawX - view.x
                    lastY = event.rawY - view.y
                    isDragging = true
                }
                MotionEvent.ACTION_MOVE -> {
                    if (isDragging) {
                        view.animate()
                            .x(event.rawX - lastX)
                            .y(event.rawY - lastY)
                            .setDuration(0)
                            .start()
                    }
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    isDragging = false
                }
            }
            true
        }




        binding.rotateIcon.setOnClickListener {
            val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation)
            binding.textView.startAnimation(rotateAnimation)
        }

        binding.scaleIcon.setOnClickListener {
            val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation)
            binding.textView.startAnimation(scaleAnimation)
        }
    }
}

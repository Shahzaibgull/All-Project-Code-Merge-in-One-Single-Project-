package com.example.navigationdrawerandbottomnavigationexample.Task_17_NDK_SO_File

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.jni.NativeLib
import com.example.navigationdrawerandbottomnavigationexample.databinding.ActivityNdkMainBinding


class NDKMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNdkMainBinding
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNdkMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        result = binding.totalResult

        binding.plusButton.setOnClickListener {
            calculateAndSetResult { NativeLib().Add(it.first, it.second) }
        }

        binding.minusButton.setOnClickListener {
            calculateAndSetResult { NativeLib().Subtract(it.first, it.second) }
        }

        binding.multiplyButton.setOnClickListener {
            calculateAndSetResult { NativeLib().Multiply(it.first, it.second) }
        }

        binding.divideButton.setOnClickListener {
            calculateAndSetResult { NativeLib().Divide(it.first, it.second) }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calculateAndSetResult(operation: (Pair<Int, Int>) -> Int) {
        val num1Text = binding.first.text.toString()
        val num2Text = binding.Second.text.toString()

        if (num1Text.isNotEmpty() && num2Text.isNotEmpty()) {
            val num1 = num1Text.toInt()
            val num2 = num2Text.toInt()
            val resultValue = operation.invoke(Pair(num1, num2))
            result.text = resultValue.toString()

            /*// Clear the input fields
            binding.first.text?.clear()
            binding.Second.text?.clear()*/
        } else {
            result.text = "Invalid input"
        }
    }
}

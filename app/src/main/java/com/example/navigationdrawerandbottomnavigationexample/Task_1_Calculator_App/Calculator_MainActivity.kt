package com.example.navigationdrawerandbottomnavigationexample.Task_1_Calculator_App


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.navigationdrawerandbottomnavigationexample.R




class Calculator_MainActivity : AppCompatActivity() {


    /*object CalculationHistory{
        val historyList: ArrayList<DataModel> = ArrayList()
    }*/
    fun TextView.appendText(text: String){  //extension function
        this.append(text)
    }
    //private lateinit var binding: ActivityCalculatorMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scientific_main)
        /*super.onCreate(savedInstanceState)
        binding= ActivityCalculatorMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHistory.setOnClickListener {

            val historyIntent = Intent(this,HistoryActivity::class.java)  // Move ->calculated result history
            startActivity(historyIntent)

        }

        binding.buttonCancel.setOnClickListener {     //apply cancel button to remove expression
            binding.inputTextView.text=""
            binding.outputTextView.text=""
        }

        //all numbers from (0 to 9) append/insert in input TextView
        binding.buttonZero.setOnClickListener {
            binding.inputTextView.appendText("0")       // insert(0 to 9 and +,-,/,x) using buttons
        }
        binding.buttonOne.setOnClickListener {
            binding.inputTextView.appendText("1")
        }
        binding.buttonTwo.setOnClickListener {
            binding.inputTextView.appendText("2")
        }
        binding.buttonThree.setOnClickListener {
            binding.inputTextView.appendText("3")
        }
        binding.buttonFour.setOnClickListener {
            binding.inputTextView.appendText("4")
        }
        binding.buttonFive.setOnClickListener {
            binding.inputTextView.appendText("5")
        }
        binding.buttonSix.setOnClickListener {
            binding.inputTextView.appendText("6")
        }
        binding.buttonSeven.setOnClickListener {
            binding.inputTextView.appendText("7")
        }
        binding.buttonEight.setOnClickListener {
            binding.inputTextView.appendText("8")
        }
        binding.buttonNine.setOnClickListener {
            binding.inputTextView.appendText("9")
        }

        //all arithmetic operations(+,-,÷,×) append/insert in input TextView
        binding.buttonPlus.setOnClickListener {
            binding.inputTextView.appendText("+")
        }
        binding.buttonMinus.setOnClickListener {
            binding.inputTextView.appendText("-")
        }
        binding.buttonMultiply.setOnClickListener {
            binding.inputTextView.appendText("*")
        }
        binding.buttonDivide.setOnClickListener {
            binding.inputTextView.appendText("/")
        }
        binding.buttonDot.setOnClickListener {
            //binding.inputTextView.setTextColor(Color.parseColor("#59A7E5"))
            binding.inputTextView.appendText(".")

        }
        //perform calculation
        binding.buttonEqual.setOnClickListener {                                //Use expression dependency to evaluate all operation

            val inputExpression = binding.inputTextView.text.toString()
            try {
                // Check for division by zero before evaluating the expression         //use try/catch to handle divide by 0(zero)
                if (inputExpression.contains("/0")) {
                    binding.outputTextView.text = "Error: Division by zero!"
                    binding.outputTextView.textSize = 30F
                } else {
                    val expression = ExpressionBuilder(inputExpression).build()
                    val result = expression.evaluate()
                    val longResult = result.toLong()

                    if (result == longResult.toDouble()) {
                        binding.outputTextView.text = longResult.toString()
                        binding.outputTextView.textSize = 80F
                        val historyItem=DataModel(inputExpression,result)   ////Calculation store in array list
                        CalculationHistory.historyList.add(historyItem)
                        //println("History List Size: ${CalculationHistory.historyList.size}")
                    } else {
                        binding.outputTextView.text = result.toString()
                        binding.outputTextView.textSize = 80F
                        val historyItem=DataModel(inputExpression,result)   ////Calculation store in array list
                        CalculationHistory.historyList.add(historyItem)
                        //println("History List Size: ${CalculationHistory.historyList.size}")
                    }
                }
            } catch (e: Exception) {
                // Handle other types of errors that might occur during expression evaluation
                binding.outputTextView.text = "Error: Invalid expression!"
            }
        }*/
    }
}
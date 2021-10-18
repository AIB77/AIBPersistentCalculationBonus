package com.example.aibpersistentcalculationbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var Num1:EditText
    lateinit var Num2:EditText
    lateinit var TVResult:TextView
    lateinit var BTN:Button
    var number1: Double = 0.0
    var number2: Float = 0.0f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Num1=findViewById(R.id.num1)
        Num2=findViewById(R.id.num2)
        TVResult=findViewById(R.id.tv)
        BTN=findViewById(R.id.thebutton)

        var number1: Double
        var number2: Float


        BTN.setOnClickListener {
            number1=Num1.text.toString().toDouble()
            number2=Num2.text.toString().toFloat()

            var r=number1*number2

            TVResult.text="The Result is ${r}"


        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putDouble("First Number" , number1)
        outState.putFloat("Second Number", number2)

    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        number1=savedInstanceState.getDouble("First Number",0.0 )
        number2=savedInstanceState.getFloat("Second Number", 0.0f)
    }
}
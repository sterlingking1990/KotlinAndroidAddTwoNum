package com.example.kotlinandroidaddtwonum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.VISIBLE
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
            var num1Entered:Int=etNum1.text.toString().toInt()
            var num2Entered:Int=etNum2.text.toString().toInt()
            tvResult.visibility=VISIBLE
            var result=sumNumbers(num1Entered,num2Entered)
            tvResult.text = result.toString()
        }
    }

    private fun sumNumbers(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}
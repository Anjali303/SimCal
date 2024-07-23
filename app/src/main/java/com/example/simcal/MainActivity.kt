package com.example.simCal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.simcal.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simcal)

        val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        btnAdd.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toDoubleOrNull()
            val secondNumber = etSecondNumber.text.toString().toDoubleOrNull()
            if (firstNumber != null && secondNumber != null) {
                val result = firstNumber + secondNumber
                tvResult.text = "Result: $result"
            } else {
                showToast("Please enter valid numbers")
            }
        }

        btnSubtract.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toDoubleOrNull()
            val secondNumber = etSecondNumber.text.toString().toDoubleOrNull()
            if (firstNumber != null && secondNumber != null) {
                val result = firstNumber - secondNumber
                tvResult.text = "Result: $result"
            } else {
                showToast("Please enter valid numbers")
            }
        }

        btnMultiply.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toDoubleOrNull()
            val secondNumber = etSecondNumber.text.toString().toDoubleOrNull()
            if (firstNumber != null && secondNumber != null) {
                val result = firstNumber * secondNumber
                tvResult.text = "Result: $result"
            } else {
                showToast("Please enter valid numbers")
            }
        }

        btnDivide.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toDoubleOrNull()
            val secondNumber = etSecondNumber.text.toString().toDoubleOrNull()
            if (firstNumber != null && secondNumber != null) {
                if (secondNumber != 0.0) {
                    val result = firstNumber / secondNumber
                    tvResult.text = "Result: $result"
                } else {
                    showToast("Cannot divide by zero")
                }
            } else {
                showToast("Please enter valid numbers")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

package com.example.calculatorapp // Make sure this matches your actual package name

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var displayTextView: TextView // Renamed for clarity, matches your XML id "textView2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize the TextView
        displayTextView = findViewById(R.id.textView2) // Use the ID from your XML

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Map of button IDs to their corresponding string values
        val buttons = mapOf(
            R.id.button9 to "clear",
            R.id.button10 to "=",
            R.id.button11 to "/",
            R.id.button12 to "*",
            R.id.button13 to "-",
            R.id.button14 to "+",
            R.id.button15 to "9",
            R.id.button16 to "8",
            R.id.button5 to "7",
            R.id.button6 to "6",
            R.id.button7 to "5",
            R.id.button8 to "4",
            R.id.button to "3",
            R.id.button2 to "2",
            R.id.button3 to "1",
            R.id.button4 to "0"
        )

        // Set up click listeners for all buttons
        for ((buttonId, buttonValue) in buttons) {
            findViewById<Button>(buttonId).setOnClickListener {
                // When a button is clicked, update the TextView's text
                // You'll likely want more complex logic here for a calculator
                if (buttonValue == "clear") {
                    displayTextView.text = "" // Or "0" if you prefer
                } else {
                    // Append the button's value to the current text in the TextView
                    // This is a more typical calculator behavior
                    displayTextView.append(buttonValue)
                }
            }
        }
    }
}

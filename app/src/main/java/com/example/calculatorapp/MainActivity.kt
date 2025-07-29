package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //reference to the button
        val button=findViewById<Button>(R.id.button4)
        val button2=findViewById<Button>(R.id.button3)
        val button3=findViewById<Button>(R.id.button2)
        val button4=findViewById<Button>(R.id.button)
        val button5=findViewById<Button>(R.id.button5)
        val button6=findViewById<Button>(R.id.button6)
        val button7=findViewById<Button>(R.id.button7)
        val button8=findViewById<Button>(R.id.button8)
        val button9=findViewById<Button>(R.id.button9)
        val button10=findViewById<Button>(R.id.button10)
        val button11=findViewById<Button>(R.id.button11)
        val button12=findViewById<Button>(R.id.button12)
        val button13=findViewById<Button>(R.id.button13)
        val button14=findViewById<Button>(R.id.button14)
        val button15=findViewById<Button>(R.id.button15)
        val button16=findViewById<Button>(R.id.button16)




    }
}
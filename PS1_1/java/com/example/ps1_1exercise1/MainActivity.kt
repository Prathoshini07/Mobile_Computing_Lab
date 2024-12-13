package com.example.ps1_1exercise1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val input1=findViewById<EditText>(R.id.editTextNumber)
        val input2=findViewById<EditText>(R.id.editTextNumber2)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener()
        {
            val in1=input1.text.toString().toIntOrNull()
            val in2=input2.text.toString().toIntOrNull()
            if(in1!=null)
            {
                val out=(in1-32)*(5/9.0)
                Toast.makeText(this,"The celcius value is:$out",Toast.LENGTH_SHORT).show()
            }
            if(in2!=null)
            {
                val out=(in2*9.0/5.0)+32
                Toast.makeText(this,"The Fahrenheit value is:$out",Toast.LENGTH_SHORT).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
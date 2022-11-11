package com.bmharwani.displaywelcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.editTextTextPersonName)
        val submitButton = findViewById<Button>(R.id.button)
        val dispMessage = findViewById<TextView>(R.id.textViewResponse)
        submitButton.setOnClickListener {
            dispMessage.setText("hola" + Name.text + "!")
        }
    }
}
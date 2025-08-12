package com.example.helloworldwithemptyview

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonHello =findViewById<Button>(R.id.btnhello)
        buttonHello.setOnClickListener {
            Log.v("Hello World!", "button clicked")
            Toast.makeText(this, "Thank you!",Toast.LENGTH_SHORT).show()
        }


    }
}
package com.example.cardkingdom

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val govidare = findViewById<Button>(R.id.BorjaspelaBtn)

        govidare.setOnClickListener {
            onButtonClick()

        }
    }



// byter aktivitet 
    fun onButtonClick() {
        val intent = Intent(this@StartActivity, MainActivity::class.java)
        startActivity(intent)
    }
}
package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class saveActivity : AppCompatActivity() {

    lateinit var textview:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        textview = findViewById(R.id.txt1)

        val intent = getIntent()
        val user:String = intent.getStringExtra("username").toString()
        var password:String = intent.getStringExtra("password").toString()

        textview.setText("Hello $user!")


    }
}



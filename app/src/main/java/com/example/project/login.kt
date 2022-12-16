package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class login : AppCompatActivity() {

    lateinit var txt:TextView
    lateinit var username:EditText
    lateinit var password:EditText

    lateinit var btnSign:AppCompatButton
    lateinit var account:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txt = findViewById(R.id.txt)
        username = findViewById(R.id.user)
        password = findViewById(R.id.pwd)
        btnSign = findViewById(R.id.btnSign)
        account=findViewById(R.id.account)
    }
        override fun onStart() {
            super.onStart()

            account.setOnClickListener {

                var intent: Intent = Intent(this, Registration::class.java)


                startActivity(intent)
            }
            btnSign.setOnClickListener {
                var user: String = username.text.toString()
                var password: String = password.text.toString()
                var intent: Intent = Intent(this, saveActivity::class.java)
                intent.putExtra("username", user)
                intent.putExtra("password",password)
                startActivity(intent)
            }


        }
    }

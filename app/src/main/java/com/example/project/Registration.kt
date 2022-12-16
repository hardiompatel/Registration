package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class Registration : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var fname:EditText
    lateinit var lname: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var repassword:EditText
    lateinit var female: RadioButton
    lateinit var male: RadioButton
    lateinit var checkbox: CheckBox
    lateinit var submit: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        textView = findViewById(R.id.txtview1)
        fname = findViewById(R.id.fname)
        email = findViewById(R.id.email)
        female = findViewById(R.id.female)
        male = findViewById(R.id.male)
        password = findViewById(R.id.pwd1)
        repassword = findViewById(R.id.pwd2)
        checkbox = findViewById(R.id.checkbox)
        submit = findViewById(R.id.submit)
    }

    override fun onStart() {
        super.onStart()
        submit.setOnClickListener {
            var email: String = email.text.toString()
            var fname: String = fname.text.toString()
            var lname: String = lname.text.toString()
            var intent: Intent = Intent(this, login::class.java)
            intent.putExtra("email", email)
            intent.putExtra("fname", fname)
            intent.putExtra("lname", lname)

            startActivity(intent)

        }
    }
}


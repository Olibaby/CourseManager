package com.example.coursemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()
        //setUpBottonOnClick()
        updateUI()

    }

    private fun setUpBottonOnClick() {
        //button.setOnClickListener {

        //}
    }

    fun updateUI() {
        btnSignUp.setOnClickListener {
            var intent = Intent(this, Main2Activity ::class.java)
            startActivity(intent)
        }
    }
}

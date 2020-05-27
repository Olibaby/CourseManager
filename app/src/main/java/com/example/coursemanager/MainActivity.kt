package com.example.coursemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        setUpButtonOnClick()
    }

    private fun setUpButtonOnClick() {
        button.setOnClickListener{
            val intent = Intent(this, MainActivity3 ::class.java)
            startActivity(intent)
        }
    }
}

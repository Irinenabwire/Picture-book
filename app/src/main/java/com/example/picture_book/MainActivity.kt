package com.example.picture_book

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,Main2Activity::class.java))
        }
    }
}

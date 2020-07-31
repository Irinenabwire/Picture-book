package com.example.picture_book

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnPrev.setOnClickListener {
            startActivity(Intent(baseContext, MainActivity::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext, Main3Activity::class.java))
        }
    }
}

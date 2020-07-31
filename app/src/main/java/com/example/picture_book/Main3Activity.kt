package com.example.picture_book

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

    btnPrev.setOnClickListener{
    startActivity(Intent(baseContext,Main2Activity::class.java))
    }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,Main4Activity::class.java))
        }
}
}




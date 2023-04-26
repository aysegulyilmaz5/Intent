package com.aysegulyilmaz.kotlinintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.userNameText
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        //getIntent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")
        userNameNext.text = username
        nameNext.text= name
    }
}
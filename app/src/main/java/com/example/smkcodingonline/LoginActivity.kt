package com.example.smkcodingonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.LinearLayout

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val fromtop = AnimationUtils.loadAnimation(this, R.anim.top_anim)
        val frombottom = AnimationUtils.loadAnimation(this, R.anim.bottom_anim)

        val toptitle = findViewById(R.id.toptitle) as LinearLayout
        val signup = findViewById(R.id.signup) as Button
        val bottomlayout = findViewById(R.id.bottom_layout) as LinearLayout

        toptitle.startAnimation(fromtop)
        bottomlayout.startAnimation(frombottom)

        signup.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}

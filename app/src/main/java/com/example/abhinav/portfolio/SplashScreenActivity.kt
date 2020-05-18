package com.example.abhinav.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT : Long = 3000
    private lateinit var topAnimation: Animation
    private lateinit var middleAnimation: Animation
    private lateinit var bottomAnimation: Animation
    private lateinit var first: View
    private lateinit var second: View
    private lateinit var third: View
    private lateinit var fourth: View
    private lateinit var fifth: View
    private lateinit var sixth: View
    private lateinit var a: TextView
    private lateinit var slogan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        first = findViewById(R.id.first_line);
        second = findViewById(R.id.second_line);
        third = findViewById(R.id.third_line);
        fourth = findViewById(R.id.fourth_line);
        fifth = findViewById(R.id.fifth_line);
        sixth = findViewById(R.id.sixth_line);
        a = findViewById(R.id.a);
        slogan = findViewById(R.id.tagLine);

        first.startAnimation(topAnimation)
        first.startAnimation(topAnimation)
        second.startAnimation(topAnimation)
        third.startAnimation(topAnimation)
        fourth.startAnimation(topAnimation)
        fifth.startAnimation(topAnimation)
        sixth.startAnimation(topAnimation)
        a.startAnimation(middleAnimation)
        slogan.startAnimation(bottomAnimation)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)

    }
}
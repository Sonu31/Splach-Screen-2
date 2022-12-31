package com.example.splashscreenex2

import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout

class Splash_Screen2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setContentView(R.layout.activity_splash_screen2)

        val linerlayout = findViewById<LinearLayout>(R.id.stripes)
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);



        val anim = AnimationUtils.loadAnimation(this, R.anim.gradient_animation)
        linerlayout.startAnimation(anim)


    }
}
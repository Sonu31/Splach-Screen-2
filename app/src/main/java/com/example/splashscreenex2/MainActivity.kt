package com.example.splashscreenex2

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    var constraintLayout:ConstraintLayout?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)


        constraintLayout = findViewById(R.id.mainlayout)




        val animDrawable = constraintLayout?.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(5000)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()


    }
}
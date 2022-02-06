package com.example.myapplication

import android.app.ActivityOptions
import android.content.Intent
import android.content.IntentFilter.create
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.core.util.Pair
import androidx.annotation.MainThread
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityOptionsCompat
import androidx.lifecycle.MutableLiveData
import java.net.URI.create

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Disable the Status bar for targetSdkVersion 29 <<<
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //Disable the status bar for targetSdkVersion 30 >>>
        window.decorView.windowInsetsController!!.hide(android.view.WindowInsets.Type.statusBars())
        setContentView(R.layout.activity_main)

        //Animation
        var topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        var bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        var slogan = findViewById<TextView>(R.id.sloganText)
        var logotext = findViewById<TextView>(R.id.logoText)
        var imageview = findViewById<ImageView>(R.id.imageView)

        imageview.startAnimation(topAnim)
        logotext.startAnimation(bottomAnim)
        slogan.startAnimation(bottomAnim)

        var splashScreen : Long = 5000
        Handler().postDelayed(Runnable{
            val intent = Intent(this@MainActivity,Login::class.java)

            var pair = Pair.create<View, String>(imageview, "logo_image")
            var pair2 = Pair.create<View, String>(logotext, "logo_name")

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                var options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair, pair2)
                startActivity(intent,options.toBundle())
            }
        }, splashScreen)

    }



}



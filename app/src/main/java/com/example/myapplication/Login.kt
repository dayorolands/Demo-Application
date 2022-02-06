package com.example.myapplication

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class Login : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //        Disable the Status bar for targetSdkVersion 29 <<<
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //        Disable the Status bar for targetSdkVersion 30 >>>>
        window.decorView.windowInsetsController!!.hide(android.view.WindowInsets.Type.statusBars())
        setContentView(R.layout.activity_login)

        val callSignup = findViewById<Button>(R.id.signup_screen)
        val login_btn = findViewById<Button>(R.id.login_button)
        val image = findViewById<ImageView>(R.id.loginImage)
        val username = findViewById<TextInputLayout>(R.id.username)
        val password = findViewById<TextInputLayout>(R.id.password)
        val sloganText = findViewById<TextView>(R.id.sloganHeader)
        val logoText = findViewById<TextView>(R.id.loginHeader)

        callSignup.setOnClickListener {
            val intent = Intent(this@Login, SignUp::class.java)

            val pair = Pair.create<View, String>(image, "logo_image")
            val pair2 = Pair.create<View, String>(logoText, "logo_name")
            val pair3 = Pair.create<View, String>(login_btn, "button_tran")
            val pair4 = Pair.create<View, String>(sloganText,"logo_desc")
            val pair5 = Pair.create<View, String>(username, "username_tran")
            val pair6 = Pair.create<View, String>(password, "password_tran")
            val pair7 = Pair.create<View, String>(callSignup, "login_signup_tran")

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair, pair2,pair3,pair4,pair5,pair6,pair7)
                startActivity(intent,options.toBundle())
            }
        }
    }
}
package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import androidx.annotation.RequiresApi
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        Disable the Status bar for targetSdkVersion 29 <<<
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //Disable the status bar for targetSdkVersion 30 >>>>>>
        window.decorView.windowInsetsController!!.hide(android.view.WindowInsets.Type.statusBars())
        setContentView(R.layout.activity_sign_up)

    }

//    fun registerUser(view: View){
//        lateinit var reference: DatabaseReference
//        lateinit var rootNode: FirebaseDatabase
//
//        var fullName = findViewById<TextInputLayout>(R.id.regFullname).editText?.text.toString()
//        var username = findViewById<TextInputLayout>(R.id.regUsername).editText?.text.toString()
//        var email = findViewById<TextInputLayout>(R.id.regEmailAdd).editText?.text.toString()
//        var phoneNuumber = findViewById<TextInputLayout>(R.id.regPhoneNo).editText?.text.toString()
//        var passwrd = findViewById<TextInputLayout>(R.id.regPassword).editText?.text.toString()
//        var btnReg = findViewById<Button>(R.id.regButton)
//        var btnLoginReg = findViewById<Button>(R.id.regLoginBtn)
//
//        reference.child(username).setValue(username)
//
//    }
}
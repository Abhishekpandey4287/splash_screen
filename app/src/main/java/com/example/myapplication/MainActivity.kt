package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        //Explicit intent
        val clickButton = findViewById<Button>(R.id.button)
        clickButton.setOnClickListener {
            val clickButtonIntent = Intent(this , secondActivity::class.java)
            startActivity(clickButtonIntent)
            // finish use as if we click the back button reather going back we will clock the app
            finish()
        }

        // Implicit Intent

        val url = "https://youtube.com"
        val implicitButton = findViewById<Button>(R.id.button2)
        implicitButton.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW , Uri.parse(url))
            startActivity(implicitIntent)
            finish()
        }
    }
}
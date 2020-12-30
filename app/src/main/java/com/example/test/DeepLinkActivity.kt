package com.example.test

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_deeplink.*

class DeepLinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink)
        setSupportActionBar(findViewById(R.id.toolbar))
        val action: String? = intent?.action
        val data: Uri? = intent?.data
        Log.i("DeepLinkActivity", "onCreate: $data")
        Toast.makeText(this, "Payment with Deeplink successfully received. $data", Toast.LENGTH_LONG).show()
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
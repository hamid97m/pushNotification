package com.pushnotification.pushnotification

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences("fcm",Context.MODE_PRIVATE) ?: return
        with(sharedPref) {
            edt_fcm.setText(getString("fcm", ""))
        }
    }
}

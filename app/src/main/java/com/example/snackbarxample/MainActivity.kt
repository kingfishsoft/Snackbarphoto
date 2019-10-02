package com.kingfishapps.photosnack

// Developer Andrew Cason, London, UK. KingFishApps.

// This is a simple example of the android snackbar function using a photo album as an example.
// Snackbar appears after pushing save photo button.

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    var coordinatorLayout: CoordinatorLayout? = null
    private var one: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coordinatorLayout = findViewById(R.id.coordinatorLayout) as CoordinatorLayout
        one = findViewById(R.id.button) as Button

        one!!.setOnClickListener(object : View.OnClickListener {
           override fun onClick(v: View) {
                val snackbar = Snackbar
                        .make(coordinatorLayout!!, getString(R.string.Snack_Text), Snackbar.LENGTH_LONG)
                snackbar.show()
            }
        })


    }
}

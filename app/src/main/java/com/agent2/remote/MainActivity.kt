package com.agent2.remote

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(18, 22, 30))
        }

        val title = TextView(this).apply {
            text = "AGENT 2"
            textSize = 32f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Remote Device Management"
            textSize = 16f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "\nDevice Status: Ready\n"
            textSize = 18f
            setTextColor(Color.GREEN)
            gravity = Gravity.CENTER
        }

        val setup = Button(this).apply {
            text = "Setup This Device"
            setOnClickListener {
                status.text = "Device setup will be available in the next phase."
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(status)
        layout.addView(setup)

        setContentView(layout)
    }
}

package com.valdez.application

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    private lateinit var layout: LinearLayout
    private lateinit var textView: TextView
    private lateinit var btnDialog: Button
    private lateinit var btnSnackBar: Button
    private lateinit var btnToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.activity_main)
        textView = findViewById(R.id.text_view)
        btnDialog = findViewById(R.id.btn_dialog)
        btnSnackBar = findViewById(R.id.btn_snack_bar)
        btnToast = findViewById(R.id.btn_toast)

        btnDialog.setOnClickListener {}

        btnSnackBar.setOnClickListener {}

        btnToast.setOnClickListener {}
    }
}

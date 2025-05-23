package com.valdez.application

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : ComponentActivity() {
    private lateinit var layout: LinearLayout
    private lateinit var textView: TextView
    private lateinit var btnDialog: Button
    private lateinit var btnSnackBar: Button
    private lateinit var btnToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.activity_main)
        textView = findViewById(R.id.text_view)
        btnDialog = findViewById(R.id.btn_dialog)
        btnSnackBar = findViewById(R.id.btn_snack_bar)
        btnToast = findViewById(R.id.btn_toast)

        btnDialog.setOnClickListener {
            showDialog()
        }

        btnSnackBar.setOnClickListener {
            showSnackBar()
        }

        btnToast.setOnClickListener {
            Toast.makeText(this, "This is a sample Toast message.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showDialog() {
        val alertDialog = AlertDialog.Builder(this@MainActivity)
        alertDialog.setTitle("Are you sure?")
            .setMessage("Do you want to change the content of the TextView?")
            .setIcon(R.drawable.baseline_warning_24).setNegativeButton("No") { dialogInterface, _ ->
                dialogInterface.cancel()
            }.setPositiveButton("Yes") { _, _ ->
                println("Hell yeah")
            }.setCancelable(false)
        alertDialog.create().show()
    }

    private fun showSnackBar() {
        val snackBar = Snackbar.make(layout, "This is a snack bar.", Snackbar.LENGTH_LONG)
        snackBar.setAction("Open") {
            val secondaryActivity = Intent(this, SecondaryActivity::class.java)
            startActivity(secondaryActivity)
        }.show()
    }
}

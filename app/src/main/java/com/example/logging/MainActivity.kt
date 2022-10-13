package com.example.logging

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private val TAG = "myLogs"
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_log = findViewById<Button>(R.id.button_log)
        var textfromedit = findViewById<EditText>(R.id.editTextTextPersonName)
        var button_timber = findViewById<Button>(R.id.button_timber)

        button_log.setOnClickListener() {
            Log.d(TAG, "Button Log:" + textfromedit.getText());
            Toast.makeText(applicationContext, "" + textfromedit.getText(), Toast.LENGTH_SHORT).show()
        }
    }
}
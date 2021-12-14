package com.mafideju.changetheme

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var layout: LinearLayout
    lateinit var textView: TextView
    lateinit var grupo: RadioGroup
    lateinit var dark: RadioButton
    lateinit var black: RadioButton
    lateinit var white: RadioButton
    lateinit var spring: RadioButton
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.layout)
        textView = findViewById(R.id.textView)
        dark = findViewById(R.id.dark)
        black = findViewById(R.id.black)
        white = findViewById(R.id.white)
        spring = findViewById(R.id.spring)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            when {
                dark.isChecked -> {
                    layout.setBackgroundColor(Color.BLACK)
                    textView.setTextColor(Color.WHITE)
                    dark.setTextColor(Color.WHITE)
                    black.setTextColor(Color.WHITE)
                    white.setTextColor(Color.WHITE)
                    spring.setTextColor(Color.WHITE)
                }
                black.isChecked -> {
                    layout.setBackgroundColor(Color.DKGRAY)
                    textView.setTextColor(Color.WHITE)
                    dark.setTextColor(Color.WHITE)
                    black.setTextColor(Color.WHITE)
                    white.setTextColor(Color.WHITE)
                    spring.setTextColor(Color.WHITE)
                }
                white.isChecked -> {
                    layout.setBackgroundColor(Color.WHITE)
                    textView.setTextColor(Color.BLACK)
                    dark.setTextColor(Color.BLACK)
                    black.setTextColor(Color.BLACK)
                    white.setTextColor(Color.BLACK)
                    spring.setTextColor(Color.BLACK)
                }
                spring.isChecked -> {
                    layout.setBackgroundColor(Color.YELLOW)
                    textView.setTextColor(Color.GREEN)
                    dark.setTextColor(Color.GREEN)
                    black.setTextColor(Color.GREEN)
                    white.setTextColor(Color.GREEN)
                    spring.setTextColor(Color.GREEN)
                }
            }
        }
    }
}
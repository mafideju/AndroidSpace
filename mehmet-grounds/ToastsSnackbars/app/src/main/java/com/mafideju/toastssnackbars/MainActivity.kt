package com.mafideju.toastssnackbars

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout

class MainActivity : AppCompatActivity() {
    lateinit var showToast: Button
    lateinit var buttonsnack: Button
    lateinit var layout: ConstraintLayout
    lateinit var buttonAlert: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast = findViewById(R.id.button)
        buttonsnack = findViewById(R.id.buttonsnack)
        layout = findViewById(R.id.layout)
        buttonAlert = findViewById(R.id.buttonAlert)

        showToast.setOnClickListener {
            Toast.makeText(applicationContext, "Este é um Toastie!", Toast.LENGTH_LONG).show()
        }
        buttonsnack.setOnClickListener {
            Snackbar.make(layout, "Este é um SnackBar Snickers", Snackbar.LENGTH_INDEFINITE)
                .setAction("Close", View.OnClickListener {  })
                .show()
        }
        buttonAlert.setOnClickListener {
            AlertDialog.Builder(this@MainActivity)
                .setTitle("Exemplo!")
                .setMessage("Este é um exemplo de AlertBox no Android")
                .setIcon(R.drawable.a24)
                .setCancelable(false)
                .setNegativeButton("Não", DialogInterface.OnClickListener { dialog, which ->
                    dialog.cancel()
                })
                .setPositiveButton("Sim", DialogInterface.OnClickListener { dialog, which ->
                    buttonAlert.text = "Clicado!"
                })
                .create()
                .show()
        }
    }
}
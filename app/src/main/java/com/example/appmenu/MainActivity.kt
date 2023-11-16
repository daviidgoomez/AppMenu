package com.example.appmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var b1 : AppCompatButton
    private lateinit var b2 : AppCompatButton
    private lateinit var b3 : AppCompatButton
    private lateinit var b4 : AppCompatButton
    private lateinit var  b5 : AppCompatButton
    private lateinit var txOculto : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
       // initUI()
        initListeners()
    }

    private fun initComponents() {
        b1 = findViewById(R.id.boton1)
        b2 = findViewById(R.id.boton2)
        b3 = findViewById(R.id.boton3)
        b4 = findViewById(R.id.boton4)
        b5 = findViewById(R.id.boton5)
        txOculto = findViewById(R.id.txOculto)
    }

    private fun initListeners() {
        b1.setOnClickListener{
            abrirActivity()
        }
        b2.setOnClickListener {
            val holaProfe:String = "Hola Profesor"
            Toast.makeText(this, holaProfe, Toast.LENGTH_LONG).show()
        }
        b3.setOnClickListener {
            val snack:String = "Esto es un SNACKBAR"
            Snackbar.make(b3, snack, Snackbar.LENGTH_LONG)
                .setAnchorView(b3).setAction("HOLA") {b3.setText("HECHO")}
                .show()
        }
        b4.setOnClickListener {
            val snack:String = "Esto es un SNACKBAR"
            Snackbar.make(b4, snack, Snackbar.LENGTH_LONG)
                .setAnchorView(b4).setAction("CERRAR APP") {finishAffinity()}
                .show()
        }
        b5.setOnClickListener {
            VisibilidadTexto()
        }
    }

    private fun VisibilidadTexto() {
        if (txOculto.visibility == View.VISIBLE) {
            txOculto.visibility = View.GONE
        } else {
            txOculto.visibility = View.VISIBLE
        }
    }

    private fun abrirActivity() {
        val intentGA = Intent(this, OtraActivity::class.java)
        startActivity(intentGA)
    }


}


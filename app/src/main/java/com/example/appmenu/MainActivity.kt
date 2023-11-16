package com.example.appmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private lateinit var b1 : AppCompatButton
    private lateinit var b2 : AppCompatButton
    private lateinit var b3 : AppCompatButton
    private lateinit var b4 : AppCompatButton
    private lateinit var  b5 : AppCompatButton



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

    }

    private fun initListeners() {
        b1.setOnClickListener{
            abrirActivity()
        }
    }

  //  private fun initUI() {

  //  }

    private fun abrirActivity() {
        val intentGA = Intent(this, OtraActivity::class.java)
        startActivity(intentGA)
    }


}


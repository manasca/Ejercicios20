package com.ejerciciosclases20.ejerciciosclass20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        persona()
    }
    fun persona() {
        val manasca = Persona(
            "manasca",
            19,
            "H",
            "a",
            180,
            10)

        println(manasca.toString())

        var edad: EditText = findViewById<EditText>(R.id.edad)
        var edadText = edad.text

        println(edadText)
    }
    fun pruebaUno() {
    }
}
package com.ejerciciosclases20.ejerciciosclass20

class Persona(
    val nombre: String,
    val edad: Int,
    val sexo: String,
    val dni: String,
    val peso: Int,
    val altura: Int) {

    public open fun esMayorDeEdad(): Boolean {
        if(edad >= 18) {
            return true
        }
        return false
    }
    public open fun comprobarSexo(): String {
        if (sexo == "H" ) {
            return "Hombre"
        } else if(sexo == "M") {
            return "Mujer"
        } else {
            return "Hombre"
        }
    }
    override fun toString(): String {
        return "Tu nombre es: $nombre, " +
                "Eres mayor de edad: ${esMayorDeEdad()}, " +
                "tu DNI es: $dni, " +
                "tu Sexo es: ${comprobarSexo()}"
    }
}
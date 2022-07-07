package com.ejerciciosclases20.ejerciciosclass20

open class DNI {
    open fun generaDNI(): Char {
        return ('A'..'Z').random() + (0 until 99999999).random()
    }
}
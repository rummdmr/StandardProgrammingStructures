package com.example.standardprogrammingstructures

import java.util.Scanner

fun main(){

    println("Kilonuzu Giriniz")
    try {
        val girdi1 = Scanner(System.`in`)
        val kilo = girdi1.nextDouble()

        println("Boyunuzu Giriniz")
        val girdi2 = Scanner(System.`in`)
        val boy = girdi2.nextDouble()

        var bmi = kilo / (boy * boy)
        println("vücut kitle endeksiniz: $bmi")
    } catch (e:java.util.InputMismatchException) {
        println("veri türü yanlış")
    }

}
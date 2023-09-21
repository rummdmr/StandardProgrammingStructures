package com.example.stdprogramlamayapilari

import java.util.Scanner

fun main() {

   val girdi=Scanner(System.`in`)
    println("Alan hesabı için geometrik şekil seçiniz\nDikdörtgen alanı için : 1\nÇember alanı için : 2")

    val secim = girdi.nextInt()
    println("seçiminiz: $secim")

    if (secim == 1) {

        println("Kısa Kenar giriniz")
        val kisakenar = girdi.nextInt()

        println("Uzun Kenar giriniz")
        val uzunkenar = girdi.nextInt()

        val dikdortgenAlan = kisakenar * uzunkenar
        println("Dikdörtgen Alanı: $dikdortgenAlan")

    }
    if(secim==2) {
        println("Yarıçap Giriniz")
        val yaricap = girdi.nextInt()

        val daireAlani = yaricap * yaricap * 3.14
        println("Daire Alanı: $daireAlani")

    }

}
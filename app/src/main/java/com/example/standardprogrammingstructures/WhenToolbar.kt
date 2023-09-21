package com.example.stdprogramlamayapilari

import java.util.Scanner

fun main(){

    val girdi= Scanner(System.`in`)
println("Tercihinizi giriniz.")
    println("sil(1)")
    println("ekle(2)")
     val tercih=girdi.nextInt()

    when (tercih) {
        1-> println("veri silinecek")
        2-> println("veri eklenecek")
        else->println("böyle bir işlem yok")
    }

}
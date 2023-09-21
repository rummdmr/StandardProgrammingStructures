package com.example.stdprogramlamayapilari

import java.util.Scanner

fun main(){

    val girdi= Scanner(System.`in`)

    println("İşlem Seçiniz:\nToplama\nÇıkarma\nÇarpma\nBölme")
    val islem=girdi.nextLine()
  println("Birinci Sayıyı Girin")
    val s1=girdi.nextInt()
    println("İkinci Sayıyı Girin")
    val s2=girdi.nextInt()

    when(islem.lowercase()){
        "toplama" -> println("İşlem Sonucu: $(s1+s2)")
        "çıkarma" -> println("İşlem Sonucu: $(s1-s2)")
        "çarpma"-> println("İşlem Sonucu: $(s1*s2)")
        "bölme"-> if (s2!=0) println("İşlem Sonucu: $(s1/s2)") else println("Sıfıra bölme hatası")

    }

}
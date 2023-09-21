package com.example.standardprogrammingstructures

import java.lang.Exception

fun main(){
    var i:Int = 14
    var d:Double=23.5
    var f:Float=42.98f

    var i2:Double= i.toDouble()
    var d2:Int=d.toInt()
    var f2:Int=f.toInt()

    println("dönüşen değerler $i2 ,$d2 , $f2")

    var i3= i.toString()
    var d3=d.toString()
    var f3=f.toString()
    println("dönüşen değerler $i3 ,$d3 , $f3")


    //Metinden Sayısala Dönüşüm

    //Yöntem 1

    var x="123"

    try {
        var x2= x.toInt()
        println("x2: $x2")
    }catch (e:Exception) {
        println("hatalı dönüşüm")
    }
    // Yöntem 2

    var y="123.5"
    var y2= y.toDoubleOrNull()
    if (y2!=null){
        println("y2: $y2")
    }else{
        println("hatalı dönüşüm")
    }
    //Yöntem 3

    var z="123y"
    var z2=z.toIntOrNull()

    z2?.let {
        println("z2: $z2")
    }
//*dönüştürülen değeri kontrol edip yazdırıyoruz yani z2yi


}
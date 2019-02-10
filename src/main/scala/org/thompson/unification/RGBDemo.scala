package org.thompson.unification

sealed case class RGB(red: Int, green: Int, blue: Int)

object RGBDemo extends App {
    val magenta = RGB(255, 0, 255)
    println(s"Magents is $magenta")
} 
package org.thompson.unification

sealed abstract trait Month
case object January extends Month
case object February extends Month

object Month  {
    def toInt(month: Month): Int = month match {
        case January => 1
        case February => 2
        case _ => 0
    }
}

object MonthDemo extends App {
    val month: Month = January
    println(s"Current month is $month and it's number is ${Month.toInt(month)}")
}
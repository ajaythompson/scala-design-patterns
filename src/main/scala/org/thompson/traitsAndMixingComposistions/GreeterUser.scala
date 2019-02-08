package org.thompson.traistAndMixingCompositions

object GreeterUser extends App {
    val user = new Greeter()
    println(user.hello())
}

trait FormalGreeting {
    def hello(): String
}

trait InformalGreeting {
    def hello(): String
}

class Greeter extends FormalGreeting with InformalGreeting {
    override def hello(): String = "Good Morning!!"
}
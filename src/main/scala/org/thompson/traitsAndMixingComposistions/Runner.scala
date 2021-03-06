package org.thompson.traistAndMixingCompositions

trait Ping {
    def ping(): Unit =  println("ping")
}

trait Pong {
    def pong(): Unit =  println("pong")
}

trait PingPong extends Ping with Pong{
    def pingPong(): Unit = {
        ping()
        pong()
    }
}

object Runner extends App with PingPong {
    pingPong()
}
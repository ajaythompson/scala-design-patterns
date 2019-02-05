package org.thompson.traistAndMixingCompositions

trait Beeper {
    def beep(times: Int): Unit = {
        1 to times foreach(x => println(s"Beep number : $x"))
    }
}

object BeeperRunner extends App {
    val beeper = new Beeper {}
    beeper.beep(10)
}
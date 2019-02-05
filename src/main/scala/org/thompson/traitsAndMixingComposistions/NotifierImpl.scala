package org.thompson.traistAndMixingCompositions

class NotifierImpl(val notificationMessage: String) extends Notifier {
    override def clear(): Unit = {
        println("clear")
    }
}
package org.thompson.traistAndMixingCompositions

//whenever there's a code in a trait it is called as mixin
trait Notifier {
    val notificationMessage: String

    def printNotification(): Unit = {
        println(notificationMessage)
    }

    def clear()
}

trait AlarmNotifier {
    this: Notifier =>
    
    def trigger(): String
}
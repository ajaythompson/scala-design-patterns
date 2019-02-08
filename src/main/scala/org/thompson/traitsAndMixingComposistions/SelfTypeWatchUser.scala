package org.thompson.traistAndMixingCompositions

object SelfTypeWatchUser extends App {
    val watch = new Watch("Self Type", 1000L) with AlarmNotifier with Notifier{
        override def trigger(): String = "Alarm trigerred!!"
        override val notificationMessage = "Self type watch notification"
        override def clear(): Unit = println("Notification cleared!!")
    }

    println(watch.trigger)
}
package org.thompson.traistAndMixingCompositions

class Watch(brand: String, initialTime: Long) {
    def getTime(): Long = System.currentTimeMillis() - initialTime
}

object WatchUser extends App{
    val expensiveWatch = new Watch("expensive brand", 1000L) with Alarm with Notifier{
        override def trigger(): String = "The alarm was trigerred."
        override val notificationMessage: String = "Alarm is running." 
        override def clear(): Unit = println("Notification is cleared.")
    }

    val cheapWatch = new Watch("cheap brand", 1000L) with Alarm {
        override def trigger(): String = "The alarm was trigerred."
    }

    println(expensiveWatch.trigger)
    println(expensiveWatch.getTime)
    expensiveWatch.clear

    println(cheapWatch.trigger)
    println(cheapWatch.getTime)
}
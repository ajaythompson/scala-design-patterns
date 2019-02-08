package org.thompson.traistAndMixingCompositions

object ReallyExpensiveWatchUser extends App  {

    // //example to show how scala avoids multiple inhertiance
    // val reallyExpensiveWatch = new Watch("really expensive watch", 1000L) with ConnectorWithHelper {
    //      override def connect(): Unit = println("Connected with another connector.")
    //      override def close(): Unit = println("Closed connection with connector.")
    // }

    // reallyExpensiveWatch.connect()
}
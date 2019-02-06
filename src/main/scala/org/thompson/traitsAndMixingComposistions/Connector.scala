package org.thompson.traistAndMixingCompositions

abstract class Connector {
    def connect()
    def close()
}

trait ConnectorWithHelper extends Connector {
    def findDriver(): Unit = println("Find driver called.")
}

class PgSqlConnector extends ConnectorWithHelper {
    override def connect(): Unit = println("connected...")
    override def close(): Unit = println("closed...")
}
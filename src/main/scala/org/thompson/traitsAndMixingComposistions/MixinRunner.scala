package org.thompson.traistAndMixingCompositions

object MixinRunner extends App with Ping with Pong {
    ping()
    pong()
}
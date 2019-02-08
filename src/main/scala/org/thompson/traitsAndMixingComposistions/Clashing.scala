package org.thompson.traistAndMixingCompositions

object Clashing extends App with A with B{
    override def hello(): String = super[A].hello
    println(hello)
}

trait A {
    def hello(): String = "Trait A"
}

trait B extends A{
    override def hello(): String = "Trait B"
}

trait C extends A {
    override def hello(): String = "Trait C"
}

trait D extends B with C {

}

object Diamond extends App with D {
    println(hello())
}
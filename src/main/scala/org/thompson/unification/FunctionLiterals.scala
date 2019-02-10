package org.thompson.unification

class FunctionLiterals {
    val sum = (a: Int, b: Int) => a + b
    def runOperation(f: (Int, Int) => Int, a: Int, b: Int) = f(a,b)
}

object FunctionLiterals extends App {
    val obj = new FunctionLiterals()

    println(s"Sum of 1 and 2 is ${obj.runOperation(obj.sum,1,2)}")
}
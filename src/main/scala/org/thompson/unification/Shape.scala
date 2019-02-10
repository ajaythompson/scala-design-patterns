package org.thompson.unification

sealed abstract trait Shape

case class Point(x: Int, y: Int)

case class Circle(center: Point, radius: Double) extends Shape
case class Rectangle (topLeft: Point, height: Double, width: Double) extends Shape

object Shape {
    def area(shape: Shape): Double = shape match {
        case Circle(_, radius) => Math.PI * Math.pow(radius, 2)
        case Rectangle(_, height, width) => height * width
    }
}

object ShapeDemo extends App {
    val circle = Circle(Point(1,1), 7)
    val area = Shape.area(circle)

    println(s"Area of circle $circle is $area")
}
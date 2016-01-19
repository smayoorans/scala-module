package hms.scala.example

import hms.scala.example.caseclass.{Fun, Var, Term}

object HelloWorld {

  def main(args: Array[String]) {
    val point = new Point(2, 4)
    println("1st point " + point)
/*    point.move(2, 3)
    println("Hello world " + point)*/

    println("Point " + point.isSimilar(point))
    println("Point " + point.isSimilar(3))

    val x = Var("x")
    val y = Fun("y", x)
    println(x.name)
    val body: Term = y.body
    println(body)
  }
}
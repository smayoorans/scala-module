package org.madrona.web

import scala.collection.mutable

object Tester {


  def main(args: Array[String]) {

    println("Hello ")

    val list = List(1, 2, 3, 4, 5, 6, 7)

    println(list.map(e => e + "2"))

    val fruit = mutable.Set("apple", "orange", "peach", "banana")
    val fruit2 = mutable.Set("apple")

    println(fruit.apply("apple"))
    println(fruit2.subsetOf(fruit))

    //Adding
    val strings: mutable.Set[String] = mutable.Set("pine", "mango")
    val x = fruit += "mango"

    println(x)



  }
}
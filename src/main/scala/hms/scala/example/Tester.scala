package hms.scala.example

object Tester {

  import scala.collection.mutable._
  def main(args: Array[String]) {

    println("Hello ")

    val list = List(1, 2, 3, 4, 5, 6, 7)

    println(list.map(e => e + "2"))

    val fruit = Set("apple", "orange", "peach", "banana")
    val fruit2 = Set("apple")

    println(fruit.apply("apple"))
    println(fruit2.subsetOf(fruit))

    //Adding
    val strings: Set[String] = Set("pine", "mango")
    val x = fruit += "mango"

    println(x)



  }
}
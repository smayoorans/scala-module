package hms.scala.example

import scala.collection.mutable
// Imports core, which grabs everything including Query DSL
import com.mongodb.casbah.Imports._
// Imports just the Query DSL along with Commons and its dependencies
import com.mongodb.casbah.query.Imports._

object HelloWorld2 extends App {

  println("Scala.Any")
  println("Scala.AnyVal")
  println("Scala.AnyRef")

  // Value classes  - Primitive types in java
  // Reference classes - Object types in java.

  // every user-defined classes in scala implicitly extends  the trait called scala.ScalaObject

  val set = new mutable.LinkedHashSet[Any]

  set += "This is a string" // add a string
  set += 34 // add a number
  set += true // Add a boolean value
  set += 'c' // Add a character
  set += main _

  val iterator : Iterator[Any] = set.iterator

  while(iterator.hasNext){
    println(" Contents " + iterator.next().toString)
  }



}

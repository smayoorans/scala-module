package hms.scala.example

trait Similarity {

  def isSimilar(x: Any) : Boolean

  def isNotSimilar(x: Any) : Boolean = !isSimilar(x)



}

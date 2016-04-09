package org.madrona.util

class Point(xc: Int, yc: Int) extends Similarity {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    "(" + x + ", " + y + ")"
  }

  def isSimilar(obj: Any): Boolean = {
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x
  }
}

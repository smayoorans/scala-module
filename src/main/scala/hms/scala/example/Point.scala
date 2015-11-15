package hms.scala.example

class Point(xc: Int, yc: Int) {

  var x = xc
  var y = yc

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    "(" + x + ", " + y + ")"
  }
}

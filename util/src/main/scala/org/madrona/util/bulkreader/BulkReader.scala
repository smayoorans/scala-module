package org.madrona.util.bulkreader

abstract class BulkReader {
  type In
  val source: In

  def read: String
}


class StringBulkReader(val source: String) extends BulkReader {
  type In = String

  def read: String = source
}

import java.io._

class FileBulkReader(val source: File) extends BulkReader {
  type In = File

  def read: String = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}


object Tester {
  def main(args: Array[String]) {
    println(new FileBulkReader(new File("test.txt")).read)
    println(new StringBulkReader("Hello").read)

    val list = List(1, 3, 34, 23, 12, 53, 21, 55, 22, 33)

    for (s <- list
         if s >= 30
         if s <= 50) println(s)
  }
}
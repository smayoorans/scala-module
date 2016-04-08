package hms.scala.example.collections

object TestCollection extends App {

  val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))

  println(extensions)

  private val filter: List[PhoneExt] = extensions.filter {
    case PhoneExt(name, ext) => ext < 200
  }


  println(filter)
}


case class PhoneExt(name: String, ext: Int)


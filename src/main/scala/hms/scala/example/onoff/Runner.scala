package hms.scala.example.onoff

object Runner extends App {

  val warmer = ComponentRegistry.warmer
  warmer.trigger()
}

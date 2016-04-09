package org.madrona.util.onoff

object Runner extends App {

  val warmer = ComponentRegistry.warmer
  warmer.trigger()
}

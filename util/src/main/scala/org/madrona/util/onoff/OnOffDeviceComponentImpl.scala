package org.madrona.util.onoff

trait OnOffDeviceComponentImpl extends OnOffDeviceComponent {

  class Heater extends OnOffDevice {
    override def on(): Unit = {
      println("heater.on")
    }

    override def off(): Unit = {
      println("heater.off")
    }
  }

}

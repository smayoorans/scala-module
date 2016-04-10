package org.madrona.util.onoff

trait OnOffDeviceComponent {

  val onOff: OnOffDevice

  trait OnOffDevice {
    def on(): Unit

    def off(): Unit
  }

}



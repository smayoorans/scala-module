package hms.scala.example.onoff

trait OnOffDeviceComponent {

  val onOff: OnOffDevice

  trait OnOffDevice {
    def on(): Unit

    def off(): Unit
  }

}



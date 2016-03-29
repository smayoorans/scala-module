package hms.scala.example.onoff

trait SensorDeviceComponent {

  val sensor: SensorDevice

  trait SensorDevice {
    def isCoffeePresent: Boolean
  }

}



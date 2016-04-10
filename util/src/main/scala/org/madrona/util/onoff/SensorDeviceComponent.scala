package org.madrona.util.onoff

trait SensorDeviceComponent {

  val sensor: SensorDevice

  trait SensorDevice {
    def isCoffeePresent: Boolean
  }

}



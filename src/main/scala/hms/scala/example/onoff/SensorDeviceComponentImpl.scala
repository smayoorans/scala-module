package hms.scala.example.onoff

trait SensorDeviceComponentImpl extends SensorDeviceComponent{

  class PotSensor extends SensorDevice{
    override def isCoffeePresent: Boolean = true
  }
}


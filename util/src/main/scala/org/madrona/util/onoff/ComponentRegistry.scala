package org.madrona.util.onoff

object ComponentRegistry extends OnOffDeviceComponentImpl with SensorDeviceComponentImpl with WarmerComponentImpl {
  override val sensor: ComponentRegistry.SensorDevice = new PotSensor
  override val onOff: ComponentRegistry.OnOffDevice = new Heater
  val warmer = new Warmer
}





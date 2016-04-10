package org.madrona.util.onoff

trait WarmerComponentImpl {

  this: SensorDeviceComponent with OnOffDeviceComponent =>

  class Warmer {
    def trigger() = {
      if (sensor.isCoffeePresent) onOff.on()
      else onOff.off()
    }
  }

}


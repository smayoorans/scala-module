package org.madrona.web.domain


import scala.beans.BeanProperty
import scala.util.Random

case class Registration(@BeanProperty var username: String = "username" + Random.nextInt(),
                        @BeanProperty var password: String = "",
                        @BeanProperty var realName: String = "Joe Tester")


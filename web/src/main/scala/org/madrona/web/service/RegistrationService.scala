package org.madrona.web.service

import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.global._
import org.madrona.web.domain.Registration

trait RegistrationService {

  def all: List[Registration]

  def create(registration: Registration)
}

object RegistrationService extends RegistrationService {

  val registrations: MongoCollection = MongoConnection()("vaadin-scala-mongo-example")("registrations")

  def all: List[Registration] = registrations.map(grater[Registration].asObject(_)).toList

  def create(registration: Registration) {
    require(registration != null)
    registrations += grater[Registration].asDBObject(registration)
  }
}

package org.madrona.web.pattern.domain

import javax.persistence.{Entity, GeneratedValue, Id}

import scala.beans.BeanProperty

@Entity
class User {

  @BeanProperty
  @Id
  @GeneratedValue
  var id: Long = _ // default value

  @BeanProperty
  var firstName: String = _

  @BeanProperty
  var lastName: String = _

}

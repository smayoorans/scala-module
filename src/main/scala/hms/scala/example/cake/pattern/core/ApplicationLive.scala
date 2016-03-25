package hms.scala.example.cake.pattern.core

import javax.persistence.Persistence

import hms.scala.example.cake.pattern.repo.UserRepositoryJPAComponent
import hms.scala.example.cake.pattern.service.DefaultUserServiceComponent

object ApplicationLive {

  val userServiceComponent = new DefaultUserServiceComponent with UserRepositoryJPAComponent {
    val em = Persistence.createEntityManagerFactory("com.madrona.example").createEntityManager()
  }

  val userService = userServiceComponent.userService

}

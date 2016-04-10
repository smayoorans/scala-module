package org.madrona.web.pattern.core

import javax.persistence.Persistence

import org.madrona.web.pattern.repo.UserRepositoryJPAComponent
import org.madrona.web.pattern.service.DefaultUserServiceComponent

object ApplicationLive {

  val userServiceComponent = new DefaultUserServiceComponent with UserRepositoryJPAComponent {
    val em = Persistence.createEntityManagerFactory("com.madrona.example").createEntityManager()
  }

  val userService = userServiceComponent.userService

}

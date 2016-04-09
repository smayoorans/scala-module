package org.madrona.web.pattern.service

import org.madrona.web.pattern.domain.User
import org.madrona.web.pattern.repo.UserRepositoryComponent

trait DefaultUserServiceComponent extends UserServiceComponent {

  // self-type annotation
  this: UserRepositoryComponent =>

  def userService = new DefaultUserService

  class DefaultUserService extends UserService {
    def findAll = userLocator.findAll

    def save(user: User): Unit = {
      userUpdater.save(user)
    }
  }

}

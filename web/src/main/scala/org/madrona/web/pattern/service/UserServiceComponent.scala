package org.madrona.web.pattern.service

import org.madrona.web.pattern.domain.User

trait UserServiceComponent {

  def userService: UserService

  trait UserService {
    def findAll: java.util.List[User]

    def save(user: User)
  }

}

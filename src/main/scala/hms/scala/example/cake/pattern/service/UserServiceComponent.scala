package hms.scala.example.cake.pattern.service

import hms.scala.example.cake.pattern.domain.User

trait UserServiceComponent {

  def userService: UserService

  trait UserService {
    def findAll: java.util.List[User]

    def save(user: User)
  }

}

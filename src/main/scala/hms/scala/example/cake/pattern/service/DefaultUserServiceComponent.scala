package hms.scala.example.cake.pattern.service

import hms.scala.example.cake.pattern.domain.User
import hms.scala.example.cake.pattern.repo.UserRepositoryComponent

trait DefaultUserServiceComponent extends UserServiceComponent{

  this: UserRepositoryComponent =>

  def userService = new DefaultUserService

  class DefaultUserService extends UserService {
    def findAll = userLocator.findAll

    def save(user: User): Unit ={
      userUpdater.save(user)
    }
  }

}

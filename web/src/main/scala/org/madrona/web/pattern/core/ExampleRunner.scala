package org.madrona.web.pattern.core

import scala.collection.JavaConversions._

import org.madrona.web.pattern.domain.User

object ExampleRunner extends App{

  val userService = ApplicationLive.userService

  val user: User = new User
  user.setFirstName("Mark")
  user.setLastName("Harrison")

  userService.save(user)

  val users: java.util.List[User] = userService.findAll

  if(!users.isEmpty){
    println()
    users.toList.foreach(args => println("successfully loaded "+ args.firstName + " " + args.lastName))
  } else {
    println("argh something went wrong!")
  }
}

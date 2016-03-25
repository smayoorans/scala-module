package hms.scala.example.cake.pattern

import java.util

import com.sun.org.apache.xerces.internal.impl.XMLEntityManager

trait UserRepositoryJPAComponent extends UserRepositoryComponent {

  val em: XMLEntityManager

  override def userLocator: UserLocator = new UserLocatorJPA(em)

  override def userUpdater: UserUpdater = new UserUpdaterJPA(em)

  class UserLocatorJPA(em: XMLEntityManager) extends UserLocator {
    override def findAll: util.List[User] = {
      println("Finding all the users")
    }
  }

  class UserUpdaterJPA(em: XMLEntityManager) extends UserUpdater {
    override def save(user: Any): Unit = ???
  }

}

package org.madrona.web.pattern.repo


import javax.persistence.EntityManager

import org.madrona.web.pattern.domain.User

trait UserRepositoryJPAComponent extends UserRepositoryComponent {

  val em: EntityManager

  override def userLocator: UserLocator = new UserLocatorJPA(em)

  override def userUpdater: UserUpdater = new UserUpdaterJPA(em)

  class UserLocatorJPA(em: EntityManager) extends UserLocator {
    override def findAll = {
      em.createQuery("from User", classOf[User]).getResultList
    }
  }

  class UserUpdaterJPA(em: EntityManager) extends UserUpdater {

    override def save(user: User): Unit = {
      // we use this function to wrap the command in a transaction. JPA requires this
      transactionally {
        em.persist(user)
      }
    }

    def transactionally[T](f: => T) = {
      val tx = em.getTransaction
      tx.begin()
      val ret = f // invoke the function
      tx.commit()

      ret
    }
  }

}

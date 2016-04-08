import sbt._

object Dependencies {
  // Versions
  lazy val akkaVersion = "2.3.8"

  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % akkaVersion
  val specs2 = "org.specs2" %% "specs2-core" % "3.0.1" % Test
  val mockito = "org.mockito" % "mockito-all" % "1.8.5"
  val junit = "junit" % "junit" % "4.10" % Test
  val hibernate = "org.hibernate" % "hibernate-core" % "4.1.8.Final"
  val scalaLibrary = "org.scala-lang" % "scala-library" % "2.10.4"
  val hsqldb = "org.hsqldb" % "hsqldb" % "2.2.4"
  val entityManager = "org.hibernate" % "hibernate-entitymanager" % "4.1.8.Final"

  val sprayCan = "io.spray" % "spray-can" % "1.1-M8"
  val sprayHttp  = "io.spray" % "spray-http" % "1.1-M8"
  //val sprayRouting = "io.spray" % "spray-routing-shapeless2" % "1.1-M8"
  /*val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.1.4"
  val akkSlf4j = "com.typesafe.akka" %% "akka-slf4j" % "2.1.4"
  val slice = "com.typesafe.slick" %% "slick" % "1.0.1"
  val mysqlConnector = "mysql" % "mysql-connector-java" % "5.1.25"
  val liftJson = "net.liftweb" %% "lift-json" % "2.5.1"
  val logback = "ch.qos.logback" % "logback-classic" % "1.0.13"*/

  // Projects
  val coreDependencies = Seq(akkaActor, specs2, mockito, junit )

  val utilDependencies = Seq(specs2, mockito, junit)

  val webDependencies = Seq(specs2, mockito, junit)
}
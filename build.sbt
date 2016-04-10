import Dependencies._
import sbt.Keys._
import sbt._

//factor out common setting into a sequence
lazy val commonSetting = Seq(
  name := "skylark", //set the name of the project
  organization := "com.madrona",
  version := "1.0.1",
  scalaVersion := "2.11.7",
  maxErrors := 20, // reduce the maximum number of errors shown by the scala compiler
  pollInterval := 1000, //increase the time between polling for file changes when using continuous execution.
  javacOptions ++= Seq("-source", "1.8", "-target", "1.8"), //append several options to the list of options passed to the Java compiler
  scalacOptions += "-deprecation" // append -deprecation to the options passed to the scala compiler
)

lazy val root = (project in file(".")).aggregate(util, core, web)

lazy val web = (project in file("web")).settings(commonSetting: _*).settings(
  libraryDependencies ++= webDependencies
)


lazy val util = (project in file("util")).settings(commonSetting: _*).settings(
  libraryDependencies ++= utilDependencies
)

lazy val core = (project in file("core")).settings(commonSetting: _*).settings(
  libraryDependencies ++= coreDependencies
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

resolvers += "Maven repository" at "http://repo1.maven.org/maven2/"

resolvers += "JBoss repository" at "https://repository.jboss.org/nexus/content/groups/public/"

resolvers += "sonatype-releases" at "http://oss.sonatype.org/content/repositories/releases"

resolvers += "Spray repository" at "http://repo.spray.io"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Vaadin add-ons repository" at "http://maven.vaadin.com/vaadin-addons"

resolvers += "Scaladin Snapshots" at "http://henrikerola.github.io/repository/snapshots/"


scalacOptions in Test ++= Seq("-Yrangepos")

autoScalaLibrary := true

scalacOptions in ThisBuild ++= Seq("-deprecation", "-unchecked", "-encoding", "UTF-8")

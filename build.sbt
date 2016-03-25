import sbt._
import Keys._

//factor out common setting into a sequence
lazy val commonSetting = Seq(
  organization := "com.madrona",
  version := "1.0.1",
  scalaVersion := "2.10.4"
)

// define ModuleID for library dependencies
val specs2 = "org.specs2" %% "specs2-core" % "3.0.1" % Test
val mockito = "org.mockito" % "mockito-all" % "1.8.5"
val junit = "junit" % "junit" % "4.10" % Test

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")

lazy val root = (project in file("."))
  .settings(commonSetting: _*)
  .settings(
    //set the name of the project
    name := "skylark",

    //set the main scala source directory to be <base>/src
    sourceDirectory in Compile := baseDirectory.value / "src",

    //set the main test source directory to be <base>/test
    sourceDirectory in Test := baseDirectory.value / "test",

    // add library dependencies
    libraryDependencies ++= Seq(junit, specs2),

    // reduce the maximum number of errors shown by the scala compiler
    maxErrors := 20,

    //increase the time between polling for file changes when using continuous execution.
    pollInterval := 1000,

    //append several options to the list of options passed to the Java compiler
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),

    // append -deprecation to the options passed to the scala compiler
    scalacOptions += "-deprecation"
  )
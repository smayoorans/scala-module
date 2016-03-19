
lazy val commonSetting = Seq(
  organization := "com.madrona",
  version := "1.0.1",
  scalaVersion := "2.10.4"
)

lazy val root = (project in file("."))
  .settings(commonSetting: _*)
  .settings(
    name := "skylark"
  )
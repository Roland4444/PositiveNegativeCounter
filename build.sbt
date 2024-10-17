ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.0.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala-example2",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"

  )

Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

ThisBuild / logBuffered := false

lazy val root = (project in file("."))
  .settings(
    name := "TestFrameworkComparison"
  ).aggregate(scalatest, specs2, utest, munit)

lazy val scalatest = (project in file("scalatest"))
  .settings(
    name := "TestFrameworkComparison_scalatest",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"
  )

lazy val specs2 = (project in file("specs2"))
  .settings(
    name := "TestFrameworkComparison_scalatest",
    libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.13.3" % "test")
  )

lazy val utest = (project in file("utest"))
  .settings(
    name := "TestFrameworkComparison_scalatest",
    libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.10" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework")
  )

lazy val munit = (project in file("munit"))
  .settings(
    name := "TestFrameworkComparison_scalatest",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

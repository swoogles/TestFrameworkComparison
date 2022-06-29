Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

ThisBuild / logBuffered := false

lazy val root = (project in file("."))
  .settings(
    name := "TestFrameworkComparison"
  ).aggregate(scalatest, specs2, utest, munit)

val zioVersion = "2.0.0"
lazy val zio = (project in file("zio"))
  .settings(
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"          % zioVersion,
      "dev.zio" %% "zio-test"     % zioVersion,
      "dev.zio" %% "zio-test-sbt" % zioVersion % Test
    ),
    testFrameworks +=
      new TestFramework(
        "zio.test.sbt.ZTestFramework"
      ),
  )

lazy val scalatest = (project in file("scalatest"))
  .settings(
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"
  )

lazy val specs2 = (project in file("specs2"))
  .settings(
    Test / fork := true,
    libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.13.3" % "test")
  )

lazy val utest = (project in file("utest"))
  .settings(
    Test / fork := true,
    libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.10" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework")
  )

lazy val munit = (project in file("munit"))
  .settings(
    Test / fork := true,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

lazy val weaver = (project in file("weaver"))
  .settings(
    libraryDependencies += "com.disneystreaming" %% "weaver-cats" % "0.7.11" % Test,
    testFrameworks += new TestFramework("weaver.framework.CatsEffect")
  )

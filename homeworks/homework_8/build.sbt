name := "homework_typeclasses"

version := "0.1"

scalaVersion := "2.12.10"

ThisBuild / scalacOptions ++= Seq(
  "-language:higherKinds",
  "-Ypartial-unification"
)

addCompilerPlugin(
  ("org.typelevel" %% "kind-projector" % "0.11.0").cross(CrossVersion.full)
)

libraryDependencies += "com.lihaoyi" %% "utest" % "0.5.3" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

name := "Lecture4"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies += "com.lihaoyi" %% "utest" % "0.5.3" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
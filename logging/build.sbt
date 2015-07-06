import Dependencies._

Project.settings // Common project build settings

name := "logging"

libraryDependencies ++= Seq(
  akka.actor,
  akka.slf4j,
  akka.testkit,
  typesafeConfig,
  logback,
  scalatest,
  apacheCommons
)

import Dependencies._

Project.settings // Common project build settings

name := "moduleN"

libraryDependencies ++= Seq(
  akka.actor
)

import Dependencies._

Project.settings // Common project build settings

name := "main"

libraryDependencies ++= Seq(
  akka.actor
)

import sbt._
import Keys._

name := "multi-project-sbt"

enablePlugins(JavaServerAppPackaging)

lazy val logging = project.in(file("logging"))

lazy val moduleN = project.in(file("moduleN")).dependsOn(logging)

lazy val main = project.in(file("main")).dependsOn(moduleN, logging)

lazy val root = (project in file(".")).aggregate(main, moduleN, logging)

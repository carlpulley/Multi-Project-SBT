import sbt._
import Keys._
import net.virtualvoid.sbt.graph.Plugin._

object Project {
  val settings: Seq[Def.Setting[_]] =
    graphSettings ++
    Seq(
      organization := "com.cakesolutions",
      scalaVersion := "2.11.6",
      version := "1.0.0-SNAPSHOT",
      scalacOptions in Compile ++= Seq(
        "-deprecation",
        "-encoding", "UTF-8", // yes, this is 2 args
        "-feature",
        "-unchecked",
        "-Xfatal-warnings",
        "-Xlint",
        "-Yno-adapted-args",
        "-Ywarn-numeric-widen",
        "-Ywarn-value-discard",
        "-Xfuture"
      ),
      javaOptions += "-Xmx2G",
      resolvers := Resolvers.settings
    )
}

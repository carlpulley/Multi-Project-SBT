import sbt._

object Resolvers {
  lazy val settings = Seq(
    Resolver.defaultLocal,
    Resolver.mavenLocal,
    Resolver.sonatypeRepo("releases"),
    "krasserm" at "http://dl.bintray.com/krasserm/maven"
  )
}

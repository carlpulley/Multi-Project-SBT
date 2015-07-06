import sbt._

object Dependencies {
  object akka {
    val version = "2.3.11"

    val actor       = "com.typesafe.akka" %% "akka-actor"                    % version
    val cluster     = "com.typesafe.akka" %% "akka-cluster"                  % version
    val contrib     = "com.typesafe.akka" %% "akka-contrib"                  % version
    val persistence = "com.typesafe.akka" %% "akka-persistence-experimental" % version
    val slf4j       = "com.typesafe.akka" %% "akka-slf4j"                    % "2.3.4"

    val leveldb     = "org.iq80.leveldb"   % "leveldb"                       % "0.7"
    val testkit     = "com.typesafe.akka" %% "akka-testkit"                  % version
  }

  object spray {
    val version = "1.3.2"

    val httpx   = "io.spray" %% "spray-httpx"              % version
    val can     = "io.spray" %% "spray-can"                % version
    val routing = "io.spray" %% "spray-routing-shapeless2" % version
    val client  = "io.spray" %% "spray-client"             % version
    val testkit = "io.spray" %% "spray-testkit"            % version
  }

  object scalaz {
    val core = "org.scalaz" %% "scalaz-core" % "7.1.1"
  }

  val apacheCommons  = "org.apache.commons"  % "commons-lang3"   % "3.3.2"
  val typesafeConfig = "com.typesafe"        % "config"          % "1.2.1"
  val logback        = "ch.qos.logback"      % "logback-classic" % "1.1.2"

  val scalatest      = "org.scalatest"      %% "scalatest"       % "2.2.2" % "test"
}

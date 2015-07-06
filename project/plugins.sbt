// To aid debugging package dependency conflicts etc.
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.5")

// To build deployment artefacts (i.e. zip, tar.gz, xz, RPM, Deb, DMG, MSI, Docker, etc.)
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.3")

// For supporting Dockerfile definitions (sbt-native-packager is still work in progress!)
addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.2.0")

addSbtPlugin("org.brianmckenna" % "sbt-wartremover" % "0.13")

addSbtPlugin("org.scalastyle" % "scalastyle-sbt-plugin" % "0.7.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

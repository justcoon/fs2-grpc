addSbtPlugin("com.codecommit" % "sbt-spiewak" % "0.22.1")
addSbtPlugin("com.codecommit" % "sbt-spiewak-sonatype" % "0.22.1")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.10.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.3")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.0")

addSbtPlugin("com.thesamet" % "sbt-protoc-gen-project" % "0.1.8")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.6"

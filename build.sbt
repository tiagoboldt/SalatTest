name := "Ecaalyx Gateway"
 
version := "1.6"
 
scalaVersion := "2.9.1"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

// Novus repo is no longer necessary since we are now hosting at OSS Sonatype
resolvers ++= Seq(
  "Typesafe"       at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Snaps" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Spray"          at "http://repo.spray.cc/",
  "releases"       at "http://scala-tools.org/repo-releases",
  "Scalate"        at "http://repo.fusesource.com/nexus/content/repositories/public",
  "releases"       at "http://oss.sonatype.org/content/repositories/releases"
)


libraryDependencies ++= Seq(
  "org.scalatest"             %% "scalatest"           % "1.8" % "test",
  "org.specs2"                %% "specs2"              % "1.11" % "test",
  "org.scalacheck"            %% "scalacheck"          % "1.10.0" % "test",
  "com.typesafe.akka"          % "akka-actor"          % "2.0.2",
  "org.slf4j"                  % "slf4j-simple"        % "1.6.4",
  "org.scalaz"                %% "scalaz-core"         % "6.0.4",
  "org.fusesource.scalate"     % "scalate-core"        % "1.5.3",
  "com.codahale"               % "jerkson_2.9.1"       % "0.5.0",
  "net.databinder"            %% "unfiltered" % "0.6.3",
  "net.databinder"            %% "unfiltered-netty-server" % "0.6.3",
  "net.databinder"            %% "dispatch-http" % "0.8.8",
  "com.novus" %% "salat" % "1.9.0"
  )

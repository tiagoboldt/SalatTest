resolvers ++= Seq(
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
  "Spray" at "http://repo.spray.cc/"
)

resolvers += Resolver.url(
  "sbt-plugin-releases", 
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)


addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

addSbtPlugin("com.github.retronym" % "sbt-onejar" % "0.8")
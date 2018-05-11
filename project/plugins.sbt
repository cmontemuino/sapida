resolvers += Classpaths.sbtPluginReleases

logLevel := Level.Warn

// https://scalameta.org/scalafmt
addSbtPlugin("com.geirsson"  % "sbt-scalafmt" % "1.5.1")

// https://github.com/dwijnand/sbt-dynver
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.0.0")

// https://github.com/sbt/sbt-release
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.8")

// https://github.com/sbt/sbt-header
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.0.0")

// https://github.com/sbt/sbt-license-report
addSbtPlugin("com.typesafe.sbt" % "sbt-license-report" % "1.2.0")

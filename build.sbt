name := "sapida"

lazy val commonSettings = Seq(
    organization := "com.github.cmontemuino",
    organizationName := "Carlos Montemuiño",
    organizationHomepage := Some(url("https://cmontemuino.github.io")),
    startYear := Some(2018),
    licenses := List("Apache-2.0" -> url("https://opensource.org/licenses/Apache-2.0")),
    javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "UTF8", "-g:lines,vars,source", "-Xlint:unchecked"),
    scalaVersion := "2.12.6",
    scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8"),
    parallelExecution in Test := false,
    crossPaths := false,
    autoScalaLibrary := false,
    scalafmtOnCompile := true,
    // Docker rejects tags which include '+'
    version in ThisBuild ~= (_.replace('+', '-')),
    dynver in ThisBuild ~= (_.replace('+', '-')),
    scmInfo := Some(ScmInfo(url("https://github.com/cmontemuino/sapida"), "git@github.com:cmontemuino/sapida.git")),
)

lazy val noPublish = Seq(
    publishArtifact := false,
    publish := {},
    publishLocal := {}
)

lazy val root = project.in(file("."))
        .settings(commonSettings: _*)
        .settings(noPublish: _*)
        .aggregate(core, consumers, producers, http, demo)
        .enablePlugins(AutomateHeaderPlugin)

lazy val core = project.in(file("core"))
        .settings(commonSettings: _*)

lazy val consumers = project.in(file("consumers"))
        .settings(commonSettings: _*)

lazy val producers = project.in(file("producers"))
        .settings(commonSettings: _*)

lazy val http = project.in(file("http"))
        .settings(commonSettings: _*)

lazy val demo = project.in(file("demo"))
        .settings(commonSettings: _*)
        .settings(noPublish: _*)
        .dependsOn(core, consumers, producers, http)
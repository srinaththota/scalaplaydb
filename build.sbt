import sbt.Keys._
import play.sbt.PlaySettings

name := "scalaplaydb"
version := "0.1"
scalaVersion := "2.13.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
libraryDependencies += guice

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.41"
)
// https://mvnrepository.com/artifact/org.scalatestplus.play/scalatestplus-play
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test


// https://mvnrepository.com/artifact/com.typesafe.play/play-slick-evolutions
libraryDependencies ++= Seq(
"com.typesafe.play" %% "play-slick" % "5.0.0",
"com.typesafe.play" %% "play-slick-evolutions" % "5.0.0"
)

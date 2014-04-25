import AssemblyKeys._

name := "dwService"

version := "0.1"

scalaVersion := "2.9.1"

resolvers ++= Seq{
  "First Dropwizard REST Service Project"
}

libraryDependencies ++= Seq(
  "com.yammer.dropwizard" % "dropwizard-core" % "0.6.1",
  "com.yammer.dropwizard" % "dropwizard-scala" % "0.6.1"
)

assemblySettings

scalaOptions ++= Seq("-unchecked", "-deprecation")

mainClass in assembly := Some("scala.service.SimpleService")

name := "Advr"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.1"
// https://mvnrepository.com/artifact/com.typesafe/config
libraryDependencies += "com.typesafe" % "config" % "1.2.1"

unmanagedResourceDirectories in Compile += baseDirectory.value / "conf"

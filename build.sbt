
name := "deeplearning-example"

version := "0.0.0"

scalaVersion := "2.11.8"

classpathTypes += "maven-plugin"

libraryDependencies ++= Seq(
  "org.nd4j" % "nd4j-native" % "0.5.0" classifier "linux-x86_64",
  "org.deeplearning4j" % "deeplearning4j-core" % "0.5.0"
)

assemblyJarName in assembly := "deeplearning-example.jar"
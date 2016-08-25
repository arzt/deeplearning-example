
name := "deeplearning-example"

version := "0.0.0"

scalaVersion := "2.11.8"

classpathTypes += "maven-plugin"

libraryDependencies ++= Seq(
  "org.nd4j" % "nd4j-native" % "0.5.0" classifier "macosx-x86_64",
  "org.nd4j" % "nd4j-native" % "0.5.0",
  "org.deeplearning4j" % "deeplearning4j-core" % "0.5.0"
)

mainClass in Compile := Some("com.github.arzt.deeplearning.GravesLSTMCharModellingExample")

assemblyJarName in assembly := "deeplearning-example.jar"
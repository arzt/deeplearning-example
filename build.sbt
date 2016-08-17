
name := "deeplearning-hacking"

version := "0.0.0"

scalaVersion := "2.11.+"

classpathTypes += "maven-plugin"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  //"org.nd4j" % "nd4s_2.11" % "0.5.0",
  "org.nd4j" % "nd4j-jblas" % "0.4-rc3.6",
  //"org.nd4j" % "nd4j-native-platform" % "0.5.0",
  "org.deeplearning4j" % "deeplearning4j-core" % "0.5.0",
  "org.springframework" % "spring-core" % "4.3.2.RELEASE"
)
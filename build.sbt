enablePlugins(FRCPlugin)

organization := "com.lynbrookrobotics"
teamNumber := 846

name := "sbt-frc-example"

version := "0.1-SNAPSHOT"

autoScalaLibrary := false

resolvers += "WPILib-Maven" at "http://team846.github.io/wpilib-maven"

libraryDependencies += "edu.wpi.first" % "wpilib" % "0.1.0.201602112135"
libraryDependencies += "edu.wpi.first" % "networktables" % "0.1.0.201602112135"

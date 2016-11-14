name := "Spark WordCount"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "1.4.0", 
				"net.sf.opencsv" % "opencsv" % "2.0")

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

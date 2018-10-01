name := "SparkPrac"

version := "0.1"

scalaVersion := "2.11.9"

//Adding one by one library dependencies
//libraryDependencies += "org.apache.spark"%%"spark-core" % "1.6.3"

//Add Multiple library dependencies at a time.

libraryDependencies ++= Seq("org.apache.spark"%%"spark-core" % "1.6.3", "org.apache.spark"%%"spark-sql" % "1.6.3")

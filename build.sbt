name := "firstSparkApp"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.apache.spark"  %% "spark-core"              % "1.3.0",
  "com.typesafe.akka" %% "akka-actor"              % "2.3.9", 
  "com.typesafe.akka" %% "akka-slf4j"              % "2.3.9",
  "org.apache.spark"  %% "spark-streaming-twitter" % "1.3.0",
  "org.apache.spark"  %% "spark-sql"               % "1.3.0",
  "org.apache.spark"  %% "spark-mllib"             % "1.3.0"
  )     

play.Project.playScalaSettings

name := "wordcount"

version :="1.0"

scalaVersion := "2.10.4"

libraryDependencies ++=Seq("org.apache.spark" % "spark-core_2.10" % "1.6.0",
							"org.apache.hadoop" % "hadoop-common" % "2.6.0",
							"org.apache.spark" % "spark-sql_2.10" % "1.6.0",
							"org.apache.spark" % "spark-hive_2.10" % "1.6.0",
							"org.apache.spark" % "spark-yarn_2.10" % "1.6.0",
							"org.apache.spark" % "spark-streaming_2.10" % "1.6.0")
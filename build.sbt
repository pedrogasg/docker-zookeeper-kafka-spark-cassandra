name := "reactive-stack"

scalaVersion := "2.10.5"

val sparkVersion = "1.5.1"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkVersion % "provided",
	"org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
	"com.datastax.spark" %% "spark-cassandra-connector" % "1.6.0-M1" % "provided",
	("org.apache.spark" %% "spark-streaming-kafka" % sparkVersion) exclude ("org.spark-project.spark", "unused")
)

assemblyJarName in assembly := name.value + ".jar" 

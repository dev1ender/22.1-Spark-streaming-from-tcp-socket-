import org.apache.spark._
import org.apache.spark.streaming._
object wordcount {    
    
def main(args:Array[String]) { 
val SparkConf = new SparkConf().setAppName("wordcount").setMaster("local[2]")
 

val ssc = new StreamingContext(SparkConf, Seconds(10))

 
    val lines = ssc.socketTextStream("localhost",9999)
 

 
val words = lines.flatMap(_.split(" "))
 
val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)
 
wordCounts.print()
 
ssc.start()       
 
    ssc.awaitTermination()  
 
  }
}
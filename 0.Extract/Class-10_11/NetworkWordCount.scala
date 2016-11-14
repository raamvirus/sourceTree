//http://stackoverflow.com/questions/27781187/how-to-stop-messages-displaying-on-spark-console

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.StreamingContext._
import org.apache.log4j.Logger
import org.apache.log4j.{Level, Logger}
import org.apache.spark.storage.StorageLevel

object NetworkWordCount {
def main(args: Array[String]) {

if(args.length <2 ){
	System.err.println("Usage : NetworkWordCount <hostname> <port>")
	System.exist(1)
}

val sparkConf = new SparkConf().setMaster("local[2]").setAppName("NetworkWordCount").set("spark.driver.allowMultipleContexts", "true")
// Create the context with 1 sec batch size
val ssc = new StreamingContext(sparkConf, Seconds(1))

val rootLogger = Logger.getRootLogger()
rootLogger.setLevel(Level.ERROR)

// Create the FileInputDStream on the directory and use the
// stream to count words in new files created
//val lines = ssc.textFileStream("/home/user/spark_datasets/streaming_dir")

val lines = ssc.socketTextStream(args(0), args(1).toInt, StorageLevel.MEMORY_AND_DISK_SER)
//val lines = ssc.socketTextStream("192.168.0.108", 9999, StorageLevel.MEMORY_AND_DISK_SER)
val words = lines.flatMap(_.split(" "))
val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)
//val wordCounts = words.map(x => (x, 1)).reduceByKeyAndWindow(_ + _,Seconds(30))
wordCounts.print()
//println("I am done")
ssc.start()
ssc.awaitTermination()
}
}

/*
nc -lk 9999
hello world hello

-------------------------------------------
Time: 1479022219000 ms
-------------------------------------------
(,1)---------------------------------------------->dummy enter
(hello,2)
(world,1)

*/
/*
val ssc = new StreamingContext(sparkConf, Seconds(5))--------------------------------> create a microbatch of 5 sec
val wordCounts = words.map(x => (x, 1)).reduceByKeyAndWindow(_ + _,Seconds(30))------> reduce keys for past 30sec. so it will reduce 6 microbatchs at once

$ nc -lk 9999
first raam
last raam

-------------------------------------------
Time: 680 ms
-------------------------------------------
(first,1)
(raam,1)

-------------------------------------------
Time: 685 ms
------------------------------------------- first
(last,1)
(first,1)
(raam,2)

-------------------------------------------
Time: 690 ms
-------------------------------------------second
(last,1)
(first,1)
(raam,2)

-------------------------------------------
Time: 695 ms
-------------------------------------------third
(last,1)
(first,1)
(raam,2)

-------------------------------------------
Time: 700 ms
-------------------------------------------fourth
(last,1)
(first,1)
(raam,2)

-------------------------------------------
Time: 705 ms
-------------------------------------------fifth
(last,1)
(first,1)
(raam,2)

-------------------------------------------
Time: 710 ms
-------------------------------------------sixth
(last,1)
(raam,1)

-------------------------------------------
Time: 715 ms
-------------------------------------------


*/
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object readFile {
	def main(args: Array[String]) {
		val sc = new SparkContext(new SparkConf().setAppName("Read file and count")) 
		
		val logFile = args(0) // should be some where on the file system
		val lines = sc.textFile(logFile,2).cache()
		
		val numAs = lines.filter(line=>line.contains("a"))
						         .count()
		println("Total number of As: %s, ".format(numAs))
	}
}

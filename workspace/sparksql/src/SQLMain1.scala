import org.apache.spark.SparkContext

import org.apache.spark.SparkContext._
import org.apache.spark.sql.SQLContext

case class Author(name: String, nbBooks: Int)

object SQLMain1 extends App{
  val sc = new SparkContext("local","app")
  val sqlContext = new SQLContext(sc)
  
  val rdd = sc.parallelize(List(Author("raam",32),(Author("rani",1))))
}


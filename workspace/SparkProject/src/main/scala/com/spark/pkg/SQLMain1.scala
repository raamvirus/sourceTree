package com.spark.pkg

import org.apache.spark.SparkContext

import org.apache.spark.sql.SQLContext

case class Author(name: String, nbBooks: Int)

object SQLMain1 extends App{
  val sc = new SparkContext("local","app")
  val sqlContext = new SQLContext(sc)
  
  val rdd = sc.parallelize(List(Author("raam",32),(Author("rani",1)))) //create an rdd
  import sqlContext.implicits._
  rdd.toDF().printSchema()            //to define a new rdd
  rdd.toDF().show()                  //to define a new rdd
  println("---------------------------------------")
  val df = rdd.toDF("names","count")   // renaming the cols
  df.printSchema()
  println("---------------------------------------")
  val df1 = sqlContext.createDataFrame(rdd, classOf[Author])
  df1.printSchema()
  df1.show()
  println("---------------------------------------")
}
/*
root
 |-- name: string (nullable = true)
 |-- nbBooks: integer (nullable = false)

+----+-------+
|name|nbBooks|
+----+-------+
|raam|     32|
|rani|      1|
+----+-------+
---------------------------------------
root
 |-- names: string (nullable = true)
 |-- count: integer (nullable = false)

---------------------------------------
root

++
||
++
||
||
++
---------------------------------------

*/
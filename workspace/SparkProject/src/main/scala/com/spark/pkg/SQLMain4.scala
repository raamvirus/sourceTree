/*save and load */
package com.spark.pkg

import org.apache.spark.SparkContext;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.api.java.JavaSQLContext;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.types.{StructType,StructField,StringType};
import  org.apache.spark.sql.types.IntegerType;
import org.apache.spark.sql.types._;


object SQLMain4 extends App{
  val sc = new SparkContext("local","app")
  val sqlContext = new SQLContext(sc)
  val path = "//home//edureka//scalaspace//Module0//Working_Files//Chapter_5//data_titanic.json";
  //val path = "hdfs://localhost:50070/raam/Working_Files/Chapter_5/data_titanic.json"
  val df = sqlContext.load(path,"json")
  
  df.printSchema()
  //------------------------------------------------------//
  //val rdd = df.rdd           
  //rdd.map(_.getDouble(1)).sum()/ rdd.count()
 //----------------------------------------------------------//
		df.registerTempTable("passengers")
		sqlContext.sql(
			"""
				|SELECT SUM(age) / count(*) FROM passengers
			""".stripMargin).show()
 //-------------------------------------------------//
		sqlContext.cacheTable("passengers")
 //-------------------------------------------------//
		sqlContext.udf.register("first_letter",(input: String) => input.charAt(0).toString)
		sqlContext.sql("SELECT first_letter(name) from passengers").show()
		
}

/*
{"pclass":1, "survived":0, "name":"Allison, Miss. Helen Loraine", "sex":"female", "age":2, "sibsp":1, "parch":2, "ticket":"113781", "fare":151.55, "cabin":"C22 C26", "embarked":"S", "boat":"", "body":null, "homeDest":"Montreal, PQ / Chesterville, ON"}

root
	|-- age: double (nullable =true)
	|--boat: string(nullable =true)
	|--pclass:long(nullable =true)
	|--survived: long(nullable=true)
*/
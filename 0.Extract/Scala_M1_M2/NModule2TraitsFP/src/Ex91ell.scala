import scala.io.Source
object Main15 extends App {
 val fileContents = scala.io.Source.fromFile("F:/squarks/Training/Edureka/Scala_Spark/temp/File_Test.txt").getLines()
 println(fileContents.mkString)
 
   println("==============0000===========")
 
 val fileContentsNL = scala.io.Source.fromFile("F:/squarks/Training/Edureka/Scala_Spark/temp/File_Test.txt").getLines().mkString("\n")
 println(fileContentsNL)
  println("==============1111===========")
 
//scala.io.Source.fromFile("G:/temp/spark_scala.txt").getLines().flatMap(_.split("\\W+")).toArray.map(println)
 
   println("==============22222===========")

 //scala.io.Source.fromFile("G:/temp/spark_scala.txt").getLines().flatMap(_.split(" ")).toArray.map(println)
 
   println("==============3333===========")

 scala.io.Source.fromFile("F:/squarks/Training/Edureka/Scala_Spark/temp/File_Test.txt")
                .getLines()
                .flatMap(_.split("\\W+"))
                .foldLeft(Map.empty[String, Int]){(count, word) =>println("Word is" + count +":::"+word); count + (word -> (count.getOrElse(word, 0) + 1))}
               .map(println)
 
               //.foldLeft(Map.empty[String, Int]){(count, word) =>count + (word -> (count.getOrElse(word, 0) + 1))}
    println("==============333===========")

 
 }
//"reduceLeft"-Applies a binary operator to all elements of this traversable or iterator, going left to right.
//foldLeft is similar to "reduceLeft" -- instead of operator ,we can apply a Function 
import scala.io.Source

object Main15 extends App {
//--------------------------------------------------------------------------------------------------------------------//
  val fileContents = scala.io.Source.fromFile("/home/edureka/scalaspace/Module4/readFile.txt").getLines() //iterator
  println(fileContents.mkString)                //merge all iterators to a string
//--------------------------------------------------------------------------------------------------------------------//
  val fileContentsNL = scala.io.Source.fromFile("/home/edureka/scalaspace/Module4/readFile.txt").getLines().mkString("\n")
  println(fileContentsNL)                      //a single string with new line characters
//--------------------------------------------------------------------------------------------------------------------//
scala.io.Source.fromFile("/home/edureka/scalaspace/Module4/readFile.txt")
    .getLines()
    .flatMap(_.split("\\W+"))
    .toArray
    .map(println)
//--------------------------------------------------------------------------------------------------------------------//
//scala.io.Source.fromFile("/home/edureka/scalaspace/Module4/readFile.txt").getLines().flatMap(_.split(" ")).toArray.map(println)
//--------------------------------------------------------------------------------------------------------------------//
scala.io.Source.fromFile("/home/edureka/scalaspace/Module4/readFile.txt")
    .getLines()                               //get each line
    .flatMap(_.split("\\W+"))                 //flatMap : put all words in a array
    .foldLeft(Map.empty[String, Int]){        //i/p is a empty map(string,int) & array of words
      (count, word) => count + (word ->(count.getOrElse(word,0) + 1));  //get the value of word, if word does not exist return 0
    }                                                                   //then we are adding 1 to the above value
    .map(println)
//--------------------------------------------------------------------------------------------------------------------//
 }

/*-------------------------- MapReduce WordCount Scala Repl----------------------------------------------------------//

scala> scala.io.Source.fromFile("/home/edureka/scalaspace/Module4/readFile.txt")
res0: scala.io.BufferedSource = non-empty iterator

scala> .getLines()
res1: Iterator[String] = non-empty iterator

scala> .flatMap(_.split("\\W+"))
res2: Iterator[String] = non-empty iterator

scala> .foldLeft(Map.empty[String, Int]){
     | (count, word) =>println("Word is " +count+":::"+word);
     | count + (word ->(count.getOrElse(word,0) + 1))
     | }
Word is Map():::Welcome
Word is Map(Welcome -> 1):::to
Word is Map(Welcome -> 1, to -> 1):::Spark
Word is Map(Welcome -> 1, to -> 1, Spark -> 1):::on
Word is Map(Welcome -> 1, to -> 1, Spark -> 1, on -> 1):::Hadoop
Word is Map(to -> 1, on -> 1, Spark -> 1, Welcome -> 1, Hadoop -> 1):::Spark------------------->2nd time
Word is Map(to -> 1, on -> 1, Spark -> 2, Welcome -> 1, Hadoop -> 1):::is
Word is Map(is -> 1, to -> 1, on -> 1, Spark -> 2, Welcome -> 1, Hadoop -> 1):::faster
Word is Map(is -> 1, faster -> 1, to -> 1, on -> 1, Spark -> 2, Welcome -> 1, Hadoop -> 1):::than
Word is Map(is -> 1, faster -> 1, than -> 1, to -> 1, on -> 1, Spark -> 2, Welcome -> 1, Hadoop -> 1):::Hadoop------>2nd
Word is Map(is -> 1, faster -> 1, than -> 1, to -> 1, on -> 1, Spark -> 2, Welcome -> 1, Hadoop -> 2):::Hello
Word is Map(is -> 1, faster -> 1, than -> 1, to -> 1, on -> 1, Hello -> 1, Spark -> 2, Welcome -> 1, Hadoop -> 2):::Raam

res3: scala.collection.immutable.Map[String,Int] = Map(is -> 1, faster -> 1, than -> 1, Raam -> 1, to -> 1, on -> 1, Hello -> 1, Spark -> 2, Welcome -> 1, Hadoop -> 2)

scala> .map(println)
(is,1)
(faster,1)
(than,1)
(Raam,1)
(to,1)
(on,1)
(Hello,1)
(Spark,2)
(Welcome,1)
(Hadoop,2)
res4: scala.collection.immutable.Iterable[Unit] = List((), (), (), (), (), (), (), (), (), ())

*/

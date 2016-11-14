/* higher order functions available with collections
"map" will take a range of elements & apply a function logic to each element,& produce a range
"filter" alos works as map
"foreach" will take a list as i/p & apply println function to each element
"reduceLeft"-Applies a binary operator to all elements of this traversable or iterator, going left to right.
"sortWith" -Sorts this mutable indexed sequence according to a comparison function.
"max"- 
"format"
*/
 

object Main12 extends App {
  def demo{
/*//----------------------------------------------------------------------------------//
	  (1 to 9).map(x => x + 1).foreach(println)  

	  (1 to 9).map(0.1 * _).foreach(println) // here _ means each element

	  (1 to 9).map("#" * _).foreach(println _) // "#"*2 o/p is "###" i.e string mul by int 
									//;;o/p  is string
//----------------------------------------------------------------------------------//
	  (1 to 9).filter(_ % 2 == 0).foreach(println _)
//----------------------------------------------------------------------------------//
// go to doc,search "range" and find "reduceLeft"

	  println((1 to 4).reduceLeft(_ + _))                     
//----------------------------------------------------------------------------------//	  
// search under "array" as spilt give o/p an array
	  val x = "Mary had a little lamb".split(" ").sortWith(_.length < _.length)
//----------------------------------------------------------------------------------//	  	  
//	  for (i <- x) println(i)                                                        */
//----------------------------------------------------------------------------------//	  	  
	val findMax = (x: Int, y: Int) =>{
		val winner = x max y
		//println("compared %d to %d ,%s is larger".format(x,y,winner))
    winner
        }
	findMax(10,35)
//----------------------------------------------------------------------------------//  
  val a = Array(20,12,35,15,42)
  a.reduceLeft(findMax)
//----------------------------------------------------------------------------------//
    val ls = List(4,2,3,1)
    val ds = ls.sortWith(_ < _)
    //ds.foreach(println)
//----------------------------------------------------------------------------------//
      val xs = Seq(1,5,3,2)                                 // List(1, 5, 3, 2)
      val res = xs.sortWith((left,right) => left > right)   //Seq[Int] = List(5, 3, 2, 1)
      //res.foreach(println)
      //print(res)
//----------------------------------------------------------------------------------//     
      def mysimplefun(a:Int): Int = (a*a)+2
      val myarray= (1 to 9).map(mysimplefun).toArray
      //println(myarray) // return obj hash value
      for(i <- myarray) {println(i)}
//----------------------------------------------------------------------------------//
  }// end of demo method  

demo // calling method
}
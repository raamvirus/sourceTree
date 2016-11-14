/*
 * This example is just a demo of various useful
 * higher order functions available with collections 
 */
object Main12 extends App {
  def demo{
    
    //--------------------------------------------------------------------------------------------------------------------------------//
	print(1 to 9)								//Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println((1 to 9).map(x => x+1))           // 1 to 9 is an collection range & map is an HOF ,map each element by adding 1 & return it
	//o/p : Vector(2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	(1 to 9).map(x => x+1).foreach(println)		// operating foreach on an collect 
	// println : any fucntion that takes one argument & doesnt return any value ,,then no need to explictly mention the input element
    
	//-------------------------------------------------------------------------------------------------------------------------------//
    (1 to 9).map(x => x*10).foreach(println)
    
     (1 to 9).map(_ *10).foreach(println)				//placeholder(_) : only one i/p arg & with in the body used only once
     

    (1 to 9).map(0.1 * _).foreach(println _)			//o/p : 0.1 0.2 0.300004 jvm inherited precision problem 
	 //-------------------------------------------------------------------------------------------------------------------------------// 
    
		println("#"*2)
    
		println("#"*10)
    
		(1 to 9).map("#" * _).foreach(println _)
			//	#
			//	##
			//	###
	 //----------------------------------------------------------------------------------------------------------------------------------//
	  println((1 to 9))
	  println("##############################################")
	  println("Filter")
	  println("##############################################")
	  
	 
	  
	  (1 to 9).filter(_ % 2 == 0).foreach(println _)
    println("##############################################")
    println("Another Condition")
    println("##############################################")
    (1 to 9).filter(x => x > 2 && x < 5).foreach(println _)    // "forloop with yeild" is equalent to HOF of "filter with foreach"
    
    println("##############################################")
		println((1 to 6).reduce(_ + _))					//reduce the elements from left to right 
		println((1 to 6).reduceLeft(_ + _))				// current value + place_holder
		println((1 to 6).reduceRight(_ + _))			// reduce from right to left.Useful when associate & commutative properties 
     
     println("##############################################")
    //scala> "Mary had a little lamb Mary".split(" ")
	//res3: Array[String] = Array(Mary, had, a, little, lamb, Mary)
	
	//scala> "Mary".length < "had".length
	//res4: Boolean = false----------------------->in sorting if its false,swap it "had, Mary, a, little,lamb, Mary"

	  
	  val x = "Mary had a little lamb Mary".split(" ").sortWith(_.length < _.length)
	  //x: Array[String] = Array(a, had, Mary, lamb, Mary, little)
	  for (i <- x) println(i)
	
	  println("##############################################")
	  println("Finding Max")
	  println("##############################################")
	  
		val findMax = (x: Int, y: Int) => {
			val winner = x max y
			println("compared %d to %d, %d was larger".format(x,y,winner))
			winner				// the last expression is the retun value of any block
		}
	  
		//val findMax1 = (x: Int, y: Int) => {val winner = x max y;println("compared %d to %d, %d was larger".format(x,y,winner));winner;}
	  
		val a = Array(20, 12, 6, 35, 2, 90,23)
		//http://alvinalexander.com/scala/scala-reduceleft-examples
		println("Max is ::: "+a.reduceLeft(findMax))// reduceleft takes 2 arguments as input
														//compared 20 to 12, 20 was larger
														//compared 20 to 6, 20 was larger
														//compared 20 to 35, 35 was larger
														//compared 35 to 2, 35 was larger
														//compared 35 to 90, 90 was larger
														//compared 90 to 23, 90 was larger
														//Max is ::: 90

	  println("##############################################")
	  println("Sorting")
	  println("##############################################")
  
	  val ls = List(4, 2, 3, 1)
	  val ds = ls.sortWith(_ > _)						//ds: List[Int] = List(4, 3, 2, 1)
	  ds.foreach(println)
	  
	 val xs = Seq(1, 5, 3, 4, 6, 2)
	 val xsresult = xs.sortWith((left,right) => left > right) //6,5,4,3,2,1
	  xsresult.foreach(println) 
	 

  }
  
  demo
}
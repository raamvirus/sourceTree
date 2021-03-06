/*This code shows the example of closures.  
  the functions which access out of bound variables (variables not in scope) are called Closures
 */

object Main13 extends App {

  def mulBy(factor : Double) = { (x : Double) => factor * x }
	//this takes double as i/p & returns a function
  //o/p-- mulBy: (factor: Double)Double => Double
//------------------------------------------------------------------------//
  val triple = mulBy(3) // o/p function is x=>3*x
	println("o/p of mulby: " + triple)
	println("o/p of triple: "+ triple(2))
//------------------------------------------------------------------------//
  val half = mulBy(0.5) // o/p is x => 0.5*x
  println(half+ "  " + half(14))
//------------------------------------------------------------------------//
    println(mulBy(2.0)(3))
  
}
/*
 * This code shows the example of
 * closures. ------------------------------------------> function takes an arg & returns another function
 */
object Main13 extends App {
 
 def mulBy(factor : Double) = { (x : Double) => factor * x }	// the last expression  in the body is the return type i.e (x : Double) => factor * x
//---------------------------------------------------------------------------------------------------------  
  val triple = mulBy(3)  //x => 3 * x		---->assigning another function to a variable    // o/p :triple: Double => Double = <function1>
  val half = mulBy(0.5)  // x => 0.5 * x
  val double = mulBy(2)  // x => 2 * x

  println(triple)		// o/p :<function1>
  println(half)			// o/p :<function1>
//---------------------------------------------------------------------------------------------------------    
  println(triple(10))  //10 => 3 * 10
  println(triple(14) + " "+ half(14))  
//---------------------------------------------------------------------------------------------------------    
  println(mulBy(4.0))    //x => 4.0 * x
  val fourtimes = mulBy(4.0)			
  println(fourtimes(2))
  //-------------- OR --------------//
  println(mulBy(4.0)(2))  //=> 4.0* 2     //calling in this way is know as "currying"          // o/p :8

  
  
  
}
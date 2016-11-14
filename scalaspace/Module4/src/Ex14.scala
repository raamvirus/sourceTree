/*This example shows the fancy style of currying
The curly braces "{}" n the defs are optional */

object Main14 extends App {
//---------------------------------------------------------------------//
  def mul(x: Int, y: Int) = x * y
  
  println(mul(2, 3))
//---------------------------------------------------------------------//
  def mulOneAtATime(x: Int) = { (y: Int) => x * y } // o/p is a function
  println(mulOneAtATime(6))                          // y => 6* y 
  println(mulOneAtATime(6)(7)) //currying : reducing no. of args one at a time
//---------------------------------------------------------------------//
	var temp = mulOneAtATime(6)
	println(temp)
	println(temp(7))
//---------------------------------------------------------------------//
  //def mulOneAtATimeNew(x: Int)(y: Int) = { x * y } 
  //println(mulOneAtATimeNew(5)(4))
}
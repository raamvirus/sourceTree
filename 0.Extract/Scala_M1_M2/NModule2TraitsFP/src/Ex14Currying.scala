/*
 * This example shows the fancy style of currying
 * The curly braces "{}" n the defs are optional
 */
object Main14 extends App {
  def mul(x: Int, y: Int) = x * y
  
  println(mul(2, 3))
  
  def mulOneAtATime(x: Int) = { (y: Int) => x * y } 
   println(mulOneAtATime(6))//y => 6 * y
   
   
  println(mulOneAtATime(6)(7))
  
  //def mulOneAtATimeNew(x: Int)(y: Int) = { x * y } 
  
 // println(mulOneAtATimeNew(5)(4))
 
  
  var temp = mulOneAtATime(6)
  println(temp) // y => 6 * y
  println (temp(5))  //(5) => 6 * 5 return will be 30
  
  println(mulOneAtATime(6)(5))
  
  

}
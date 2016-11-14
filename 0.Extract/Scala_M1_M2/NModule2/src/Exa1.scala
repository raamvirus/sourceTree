// These are meant to be typed into the REPL. You can also run
//Basic example on object and class

class Counter1 {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}

object Main1 extends App {
  val myCounter = new Counter1  //No (). Another difference from java
  val myCounter1 = new Counter1() // () ok
  myCounter.increment()
  println(myCounter.current)

  
 println(myCounter1.current()) // () ok
}

class Counter2 {
  private var value = 0
  def increment() { value += 1 }
  def current = value // No () in definition
}


/*
object Main2 extends App {
val myCounter = new Counter2
myCounter.current // () not ok

println(myCounter.current)


}
*/
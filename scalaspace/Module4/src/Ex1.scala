//import java.io.Serializable

trait Logger1 {
                                                    // no "abstract" keyword is needed
  def log(msg: String)                            // An abstract method - no implementation 
 //def log(msg: String){println("i am from trait")}   // concrete method - with some implementation 

}
//--------------------------------------------------------------------------------------------//
class ConsoleLogger1 extends Logger1 {             // "extends" for single trait/class & "extends with with" for 3 trails

  def log(msg: String) { println(msg) }         // No override needed
//override def log(msg: String) { println(msg) }    //override needed for concrete methods

}
//--------------------------------------------------------------------------------------------//
object Main1 extends App {

  val logger = new ConsoleLogger1
  logger.log("Hi..! I am printing from Main..!!")

}

//---scala force to implement abstact method in the child class-- comment out log method in child and see//
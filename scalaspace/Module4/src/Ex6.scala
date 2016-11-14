/* This example shows the richness of the traits, which could be completely
 * invisible to  implementing classes and objects!
 */

trait Logger6 {
  def log(msg: String)					// abstract method
  def info(msg: String) { log("INFO: " + msg) }		// concrete method -log is ovriden in class
  def warn(msg: String) { log("WARN: " + msg) }		// concrete method -log is ovriden in class
  def fatal(msg: String) { log("BREACH: " + msg) }	// concrete method -log is ovriden in class
}
//-----------------------------------------------------------------------------------//
class Account6 {					//base class
  protected var balance = 0.0
}
//-----------------------------------------------------------------------------------//

class SavingsAccount6 extends Account6 with Logger6 {
  def withdraw(amount: Double) {
    if (amount > balance) fatal("Insufficient funds")   //calling fatal method
    else balance -= amount
  }

  // actual over ride happened here

  override def log(msg: String) { println("AppID:22" + msg) }  ///this can be used where we need to prefex appID etc.,
  //def log(msg: String) { println("AppID:22" + msg) }         //without override also works.
                                                               //But here log method should be defined
}
//-----------------------------------------------------------------------------------//

object Main6 extends App {
  val acct1 = new SavingsAccount6
  acct1.withdraw(100) 
}


//This example shows overriding abstract method of a trait in another trait
//Example 1 was showing overriding of an abstract method in a CLASS at object level


trait Logger5 {
  def log(msg: String) // This method is abstract.no implementation
	//def log(msg: String) {}
}

trait TimestampLogger5 extends Logger5 {
  abstract override def log(msg: String) {
//override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }
}

trait ConsoleLogger5 extends Logger5 {
  override def log(msg: String) { println(msg) }
}

class Account5 {
  protected var balance = 0.0
}

abstract class SavingsAccount5 extends Account5 with Logger5 { // abstract class
  def withdraw(amount: Double) {
    if (amount > balance) log("No Funds at all...!!")        //calling log method
    else balance -= amount
  }

  // More methods ...
}

object Main5 extends App {
	//val acct1 = new SavingsAccount5   //error
  val acct1 = new SavingsAccount5 with ConsoleLogger5 with
    TimestampLogger5                                     //first timestamplogger5,then consolelogger5
  acct1.withdraw(980) 
}
//Example of Construction.

import java.io._
import java.util._

trait Logger9 {
  //Check for number of logging on this. Twice or once
  println("Constructing Logger9")
  def log(msg: String)
}

trait FileLogger9 extends Logger9 {
  println("Constructing FileLogger9")


  def log(msg: String) { println("In FileLogger9 : "+msg); }
}

trait ShortLogger9 extends Logger9 {
  println("Constructing ShortLogger9")

  val maxLength: Int // An abstract field
  abstract override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) {println("In ShortLogger9 if : "+msg);msg} else {println("In ShortLogger9 else : "+msg);msg.substring(0, maxLength - 3) + "..."})
  }
}

class Account9 {
  println("Constructing Account9 Class")

  protected var balance = 0.0
}

class SavingsAccount9 extends Account9 with FileLogger9 with ShortLogger9 {
  println("Constructing SavingsAccount9")

  val maxLength = 15
  def withdraw(amount: Double) {
    if (amount > balance) log("We are Sorry.. No funds..!!")
    else balance -= amount
  }

  // More methods ...
}

object Main9 extends App {
  val acct = new SavingsAccount9
// can be tried by commenting below two lines
    acct.withdraw(100) 
  println("Look into myapp.log for the log message.");
}
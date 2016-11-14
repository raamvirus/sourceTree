import java.io._
import java.util._

trait Logger9 {
	//check for number of logging on this. Twice or once
  println("Constructing Logger9")
  def log(msg: String)
}
//---------------------------------------------------------------------------------//

trait FileLogger9 extends Logger9 {
  println("Constructing FileLogger9")

										 // val out = new PrintWriter("app.log") // Part of the trait’s constructor
										 // out.println("# " + new Date().toString) // Also part of the constructor
										 // out.flush();
  def log(msg: String) { println(msg);  }		                         //def log(msg: String) { out.println(msg); out.flush() }
}

//---------------------------------------------------------------------------------//

trait ShortLogger9 extends Logger9 {
  println("Constructing ShortLogger9")

  val maxLength: Int                           // An abstract field
  abstract override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "...")
  }
}

//---------------------------------------------------------------------------------//

class Account9 {
  println("Constructing Account9")

  protected var balance = 0.0
}

//---------------------------------------------------------------------------------//
//Traits(or objects) are constructed from left to right;;;Within each trait, the parent gets constructed first
//Account9,FileLogger9 extends Logger9,ShortLogger9 extends Logger9.so the order is A9,L9,F9,Short9

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
  acct.withdraw(100) // method will be right to left so Short9,F9,L9,A9 
  
	println("Look into myapp.log for the log message.");
}
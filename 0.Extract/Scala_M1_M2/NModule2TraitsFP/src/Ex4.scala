//Trait can extend another trait
//Multiple traits extended using keyword with
//Object could be constructed with multiple traits.
//Method invoking happens from last

trait Logged4 {
  def log(msg: String) { }
}

trait ConsoleLogger4 extends Logged4 {
  override def log(msg: String) { println(msg) }
}

trait TimestampLogger4 extends Logged4 {
  override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }
}

trait ShortLogger4 extends Logged4 {
  val maxLength = 17 
  override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "...")
  }
}

class Account4 {
  protected var balance = 0.0
}

class SavingsAccount4 extends Account4 with Logged4 {
  def withdraw(amount: Double) {
    if (amount > balance) log("Not enough funds..!")
    else balance -= amount
  }

  // More methods ...
}

object Main extends App {
  val acct1 = new SavingsAccount4 with ConsoleLogger4 with
    TimestampLogger4 with ShortLogger4
  val acct2 = new SavingsAccount4 with ConsoleLogger4 with
    ShortLogger4 with TimestampLogger4
    
    
  acct1.withdraw(48)  //ShortLogger4 first then TimestampLogger4 - start from end
  acct2.withdraw(48) //*** //TimestampLogger4 then ShortLogger4 - start from end
}


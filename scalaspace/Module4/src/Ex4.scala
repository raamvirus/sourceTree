//-----------------------------------layered traits--from last----------//
trait Logged4 {
  def log(msg: String) { }
}
//--------------------------------------------------------------------//
trait ConsoleLogger4 extends Logged4 {
  override def log(msg: String) { println(msg) }
}
//--------------------------------------------------------------------//
trait TimestampLogger4 extends Logged4 {
  override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)                 
  }
}
//--------------------------------------------------------------------//
trait ShortLogger4 extends Logged4 {
  val maxLength = 17 
  override def log(msg: String) {
    super.log(                              //super.log calls the next trait in the trait hierarchy
      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "***") 
  }
}
//--------------------------------------------------------------------//
class Account4 {
  protected var balance = 0.0
}
//--------------------------------------------------------------------//
class SavingsAccount4 extends Account4 with Logged4 {
  def withdraw(amount: Double) {
    if (amount > balance) log("Not enough funds..!")    //20 char len 
    else balance -= amount
  }

}
//--------------------------------------------------------------------//
object Main extends App {

  val acct1 = new SavingsAccount4 with ConsoleLogger4 with
    TimestampLogger4 with ShortLogger4

  val acct2 = new SavingsAccount4 with ConsoleLogger4 with
    ShortLogger4 with TimestampLogger4

  acct1.withdraw(48)  //ShortLogger4 first then TimestampLogger4 - starts from end  
                      //msg= Not enough fun***
                      //dMon Jan 18 03:25:38 IST 2016 + msg
//--------------------------------------------------------------------//
  acct2.withdraw(48) //TimestampLogger4 then ShortLogger4 
                    //Mon Jan 18 03:25:38 IST 2016 Not enough funds..!
                   //Mon Jan 18 03:***                     --truncate 14 char & append ***  
}

// usecase : premimum customers different flow & normal customers different flow in the same method
//eg: premiumm customer 2 stages of verification & normal customer 8 stages of verifications

//in class,the extension happens from left
//in traits,the extenstion happens from right